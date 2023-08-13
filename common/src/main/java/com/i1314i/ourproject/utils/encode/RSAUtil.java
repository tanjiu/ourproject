package com.i1314i.ourproject.utils.encode;

import org.apache.commons.codec.binary.Hex;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * RSA,一种非对称加密算法
 * @author 平行时空
 * @created 2018-10-30 16:10
 **/
public class RSAUtil {

    public static final String ALGORITHM = "RSA";

    public static final int KEY_SIZE = 1024;

    public static Base64.Decoder decoder = Base64.getDecoder();
    public static Base64.Encoder encoder = Base64.getEncoder();




        /*
        RSA算法，需要两个密钥来进行加密和解密，分别是公钥和私钥。
        需要注意的一点，这个公钥和私钥必须是一对的，如果用公钥对数据进行加密，那么只有使用对应的私钥才能解密，反之亦然。
        由于加密和解密使用的是两个不同的密钥，因此，这种算法叫做非对称加密算法。

        其算法具体实现基于一个十分简单的数论事实：将两个大素数相乘十分容易，但是想要对其乘积进行因式分解却极其困难，因此可以将乘积公开作为加密密钥。
     */
//
//    private static RSAPublicKey rsaPublicKey;
//    private static RSAPrivateKey rsaPrivateKey;

    public static Map<String,Object> generateKey(){
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            // ‘512’，表示生成的是128位字符
            keyPairGenerator.initialize(512);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            RSAPublicKey rsaPublicKey = (RSAPublicKey)keyPair.getPublic();
            RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) keyPair.getPrivate();
            Map<String,Object> keyPairs = new HashMap<>();
            keyPairs.put("publicKey",rsaPublicKey);
            keyPairs.put("privateKey",rsaPrivateKey);
            return keyPairs;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * RSA私钥加密
     * @param message 要加密的信息
     * @return 加密后的字符串
     */
    public static String encrypt(String message, RSAPrivateKey rsaPrivateKey){
        try {
            PKCS8EncodedKeySpec pkcs8EncodedKeySpec
                    = new PKCS8EncodedKeySpec(rsaPrivateKey.getEncoded());
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, privateKey);
            byte[] resultBytes = cipher.doFinal(message.getBytes());
            return Hex.encodeHexString(resultBytes);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * RSA公钥解密
     * @param message 要解密的信息
     * @return 解密后的字符串
     */
    public static String decrypt(String message, RSAPublicKey rsaPublicKey){
        try {
            X509EncodedKeySpec x509EncodedKeySpec =
                    new X509EncodedKeySpec(rsaPublicKey.getEncoded());
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, publicKey);
            byte[] resultBytes = cipher.doFinal(Hex.decodeHex(message.toCharArray()));
            return new String(resultBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



    /**
     * 生成密钥对
     */
    public static HashMap<String, String> generateKeyPair() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(ALGORITHM);
        KeyPair keyPair;
        try {
            keyPairGenerator.initialize(KEY_SIZE,
                    new SecureRandom(UUID.randomUUID().toString().replaceAll("-", "").getBytes()));
            keyPair = keyPairGenerator.generateKeyPair();
        }
        catch (InvalidParameterException e) {

            throw e;
        }
        catch (NullPointerException e) {
            throw e;
        }

        RSAPublicKey rsaPublicKey = (RSAPublicKey) keyPair.getPublic();
        RSAPrivateKey rsaPrivateKey = (RSAPrivateKey) keyPair.getPrivate();

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("private", encoder.encodeToString(rsaPrivateKey.getEncoded()));
        map.put("public", encoder.encodeToString(rsaPublicKey.getEncoded()));
        return map;
    }


    /**
     * 公钥
     * @param key
     * @return
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     */
    public static PublicKey getPublicKeyFromString(String key) throws NoSuchAlgorithmException, InvalidKeySpecException {

        // 取得公钥
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(decoder.decode(key));

        KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);

        PublicKey publicKey = keyFactory.generatePublic(x509KeySpec);

        return publicKey;
    }

    /**
     * 获得私钥
     * @param key
     * @return
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     */
    public static PrivateKey getPrivateKeyFromString(String key) throws NoSuchAlgorithmException, InvalidKeySpecException {

        // 取得私钥
        PKCS8EncodedKeySpec x509KeySpec = new PKCS8EncodedKeySpec(decoder.decode(key));

        KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);

        PrivateKey privateKey = keyFactory.generatePrivate(x509KeySpec);

        return privateKey;
    }




    /**
     * RSA公钥加密
     *
     * @param content
     *            等待加密的数据
     * @param publicKey
     *            RSA 公钥 if null then getPublicKey()
     * @return 加密后的密文(16进制的字符串)
     */
    public static String encryptByPublic(byte[] content, PublicKey publicKey) {

        if (publicKey == null) {
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            // 该密钥能够加密的最大字节长度
            int splitLength = ((RSAPublicKey) publicKey).getModulus().bitLength() / 8 - 11;
            byte[][] arrays = splitBytes(content, splitLength);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte[] array : arrays) {
                stringBuffer.append(bytesToHexString(cipher.doFinal(array)));
            }
            return stringBuffer.toString();
        }
        catch (NoSuchAlgorithmException e) {
        }
        catch (NoSuchPaddingException e) {
        }
        catch (InvalidKeyException e) {
        }
        catch (BadPaddingException e) {
        }
        catch (IllegalBlockSizeException e) {
        }
        return null;
    }

    /**
     * RSA私钥加密
     *
     * @param content
     *            等待加密的数据
     * @param privateKey
     *            RSA 私钥 if null then getPrivateKey()
     * @return 加密后的密文(16进制的字符串)
     */
    public static String encryptByPrivate(byte[] content, PrivateKey privateKey) {

        if (privateKey == null) {
            //privateKey = getPrivateKey();
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, privateKey);
            // 该密钥能够加密的最大字节长度
            int splitLength = ((RSAPrivateKey) privateKey).getModulus().bitLength() / 8 - 11;
            byte[][] arrays = splitBytes(content, splitLength);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte[] array : arrays) {
                stringBuffer.append(bytesToHexString(cipher.doFinal(array)));
            }
            return stringBuffer.toString();
        }
        catch (NoSuchAlgorithmException e) {
        }
        catch (NoSuchPaddingException e) {
        }
        catch (InvalidKeyException e) {
        }
        catch (BadPaddingException e) {
        }
        catch (IllegalBlockSizeException e) {
        }
        return null;
    }

    /**
     * RSA私钥解密
     *
     * @param content
     *            等待解密的数据
     * @param privateKey
     *            RSA 私钥 if null then getPrivateKey()
     * @return 解密后的明文
     */
    public static String decryptByPrivate(String content, PrivateKey privateKey) {

        if (privateKey == null) {
            //privateKey = getPrivateKey();
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            // 该密钥能够加密的最大字节长度
            int splitLength = ((RSAPrivateKey) privateKey).getModulus().bitLength() / 8;
            byte[] contentBytes = hexStringToBytes(content);
            byte[][] arrays = splitBytes(contentBytes, splitLength);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte[] array : arrays) {
                stringBuffer.append(new String(cipher.doFinal(array)));
            }
            return stringBuffer.toString();
        }
        catch (NoSuchAlgorithmException e) {
        }
        catch (NoSuchPaddingException e) {
        }
        catch (InvalidKeyException e) {
        }
        catch (BadPaddingException e) {
        }
        catch (IllegalBlockSizeException e) {
        }
        return null;
    }

    /**
     * RSA公钥解密
     *
     * @param content
     *            等待解密的数据
     * @param publicKey
     *            RSA 公钥 if null then getPublicKey()
     * @return 解密后的明文
     */
    public static String decryptByPublic(String content, PublicKey publicKey) {

        try {
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.DECRYPT_MODE, publicKey);
            // 该密钥能够加密的最大字节长度
            int splitLength = ((RSAPublicKey) publicKey).getModulus().bitLength() / 8;
            byte[] contentBytes = hexStringToBytes(content);
            byte[][] arrays = splitBytes(contentBytes, splitLength);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte[] array : arrays) {
                stringBuffer.append(new String(cipher.doFinal(array)));
            }
            return stringBuffer.toString();
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
        catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        catch (BadPaddingException e) {
            e.printStackTrace();
        }
        catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据限定的每组字节长度，将字节数组分组
     *
     * @param bytes
     *            等待分组的字节组
     * @param splitLength
     *            每组长度
     * @return 分组后的字节组
     */
    public static byte[][] splitBytes(byte[] bytes, int splitLength) {

        // bytes与splitLength的余数
        int remainder = bytes.length % splitLength;
        // 数据拆分后的组数，余数不为0时加1
        int quotient = remainder != 0 ? bytes.length / splitLength + 1 : bytes.length / splitLength;
        byte[][] arrays = new byte[quotient][];
        byte[] array = null;
        for (int i = 0; i < quotient; i++) {
            // 如果是最后一组（quotient-1）,同时余数不等于0，就将最后一组设置为remainder的长度
            if (i == quotient - 1 && remainder != 0) {
                array = new byte[remainder];
                System.arraycopy(bytes, i * splitLength, array, 0, remainder);
            }
            else {
                array = new byte[splitLength];
                System.arraycopy(bytes, i * splitLength, array, 0, splitLength);
            }
            arrays[i] = array;
        }
        return arrays;
    }

    /**
     * 将字节数组转换成16进制字符串
     *
     * @param bytes
     *            即将转换的数据
     * @return 16进制字符串
     */
    public static String bytesToHexString(byte[] bytes) {

        StringBuffer sb = new StringBuffer(bytes.length);
        String temp = null;
        for (int i = 0; i < bytes.length; i++) {
            temp = Integer.toHexString(0xFF & bytes[i]);
            if (temp.length() < 2) {
                sb.append(0);
            }
            sb.append(temp);
        }
        return sb.toString();
    }

    /**
     * 将16进制字符串转换成字节数组
     *
     * @param hex
     *            16进制字符串
     * @return byte[]
     */
    public static byte[] hexStringToBytes(String hex) {

        int len = (hex.length() / 2);
        hex = hex.toUpperCase();
        byte[] result = new byte[len];
        char[] chars = hex.toCharArray();
        for (int i = 0; i < len; i++) {
            int pos = i * 2;
            result[i] = (byte) (toByte(chars[pos]) << 4 | toByte(chars[pos + 1]));
        }
        return result;
    }

    /**
     * 将char转换为byte
     *
     * @param c
     *            char
     * @return byte
     */
    private static byte toByte(char c) {

        return (byte) "0123456789ABCDEF".indexOf(c);
    }


}
