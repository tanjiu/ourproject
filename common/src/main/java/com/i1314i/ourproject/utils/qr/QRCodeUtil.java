
package com.i1314i.ourproject.utils.qr;

import com.google.zxing.*;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.i1314i.ourproject.utils.common.TemplateUtils;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

/**
 * 工具类
 */
public class QRCodeUtil {
	private static final String CHARSET = "utf-8";
	private static final String FORMAT_NAME = "JPG";
	// 二维码尺寸  x=y
	private static final int QRCODE_SIZE = 450;
	// LOGO宽度
	private static final int WIDTH = 100;
	// LOGO高度
	private static final int HEIGHT = 100;

	private static BufferedImage createImage(String content, String imgPath,
											 boolean needCompress) throws Exception {
		Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
		hints.put(EncodeHintType.CHARACTER_SET, CHARSET);
		hints.put(EncodeHintType.MARGIN, 1);
		BitMatrix bitMatrix = new MultiFormatWriter().encode(content,
				BarcodeFormat.QR_CODE, QRCODE_SIZE, QRCODE_SIZE, hints);
		int width = bitMatrix.getWidth();
		int height = bitMatrix.getHeight();
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				image.setRGB(x, y, bitMatrix.get(x, y) ? 0xFF000000
						: 0xFFFFFFFF);
			}
		}
		if (imgPath == null || "".equals(imgPath)) {
			return image;
		}
		// 插入图片
		QRCodeUtil.insertImage(image, imgPath, needCompress);
		return image;
	}


	private static BufferedImage createImagebyfile(String content, File file,
												   boolean needCompress) throws Exception {
		Hashtable<EncodeHintType, Object> hints = new Hashtable<EncodeHintType, Object>();
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
		hints.put(EncodeHintType.CHARACTER_SET, CHARSET);
		hints.put(EncodeHintType.MARGIN, 1);
		BitMatrix bitMatrix = new MultiFormatWriter().encode(content,
				BarcodeFormat.QR_CODE, QRCODE_SIZE, QRCODE_SIZE, hints);
		int width = bitMatrix.getWidth();
		int height = bitMatrix.getHeight();
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				image.setRGB(x, y, bitMatrix.get(x, y) ? 0xFF000000
						: 0xFFFFFFFF);
			}
		}
		if (file == null) {
			return image;
		}
		// 插入图片
		QRCodeUtil.insertImagefile(image, file, needCompress);
		return image;
	}

	/**
	 * 插入LOGO
	 *
	 * @param source
	 *            二维码图片
	 * @param imgPath
	 *            LOGO图片地址
	 * @param needCompress
	 *            是否压缩
	 * @throws Exception
	 */
	private static void insertImage(BufferedImage source, String imgPath,
									boolean needCompress) throws Exception {
		File file = new File(imgPath);
		if (!file.exists()) {
			System.err.println(""+imgPath+"   该文件不存在！");
			return;
		}
		Image src = ImageIO.read(new File(imgPath));
		int width = src.getWidth(null);
		int height = src.getHeight(null);
		if (needCompress) { // 压缩LOGO
			if (width > WIDTH) {
				width = WIDTH;
			}
			if (height > HEIGHT) {
				height = HEIGHT;
			}
			Image image = src.getScaledInstance(width, height,
					Image.SCALE_SMOOTH);
			BufferedImage tag = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics g = tag.getGraphics();
			g.drawImage(image, 0, 0, null); // 绘制缩小后的图
			g.dispose();
			src = image;
		}
		// 插入LOGO
		Graphics2D graph = source.createGraphics();
		int x = (QRCODE_SIZE - width) / 2;
		int y = (QRCODE_SIZE - height) / 2;
		graph.drawImage(src, x, y, width, height, null);
		Shape shape = new RoundRectangle2D.Float(x, y, width, width, 6, 6);
		graph.setStroke(new BasicStroke(3f));
		graph.draw(shape);

		//绘制边框
		BasicStroke stroke = new BasicStroke(5,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
		// 设置笔画对象
		graph.setStroke(stroke);
		//指定弧度的圆角矩形
		RoundRectangle2D.Float round = new RoundRectangle2D.Float(x, y, width, width,6,6);
		graph.setColor(Color.white);
		// 绘制圆弧矩形
		graph.draw(round);

		//设置logo 有一道灰色边框
		BasicStroke stroke2 = new BasicStroke(1,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
		// 设置笔画对象
		graph.setStroke(stroke2);
		RoundRectangle2D.Float round2 = new RoundRectangle2D.Float(x, y, width, width,6,6);
		graph.setColor(new Color(128,128,128));
		graph.draw(round2);// 绘制圆弧矩形
		graph.dispose();
	}

	/**
	 * 插入LOGO
	 *
	 * @param source
	 *            二维码图片
	 * @param file
	 *            LOGO图片地址file
	 * @param needCompress
	 *            是否压缩
	 * @throws Exception
	 */
	private static void insertImagefile(BufferedImage source, File file,
										boolean needCompress) throws Exception {

		if (!file.exists()) {
			System.err.println(""+file.getPath()+"   该文件不存在！");
			return;
		}
		Image src = ImageIO.read(file);
		int width = src.getWidth(null);
		int height = src.getHeight(null);
		if (needCompress) { // 压缩LOGO
			if (width > WIDTH) {
				width = WIDTH;
			}
			if (height > HEIGHT) {
				height = HEIGHT;
			}
			Image image = src.getScaledInstance(width, height,
					Image.SCALE_SMOOTH);
			BufferedImage tag = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics g = tag.getGraphics();
			g.drawImage(image, 0, 0, null); // 绘制缩小后的图
			g.dispose();
			src = image;
		}
		// 插入LOGO
		Graphics2D graph = source.createGraphics();
		int x = (QRCODE_SIZE - width) / 2;
		int y = (QRCODE_SIZE - height) / 2;
		graph.drawImage(src, x, y, width, height, null);
		Shape shape = new RoundRectangle2D.Float(x, y, width, width, 6, 6);
		graph.setStroke(new BasicStroke(3f));
		graph.draw(shape);

		//绘制边框
		BasicStroke stroke = new BasicStroke(5,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
		// 设置笔画对象
		graph.setStroke(stroke);
		//指定弧度的圆角矩形
		RoundRectangle2D.Float round = new RoundRectangle2D.Float(x, y, width, width,6,6);
		graph.setColor(Color.white);
		// 绘制圆弧矩形
		graph.draw(round);

		//设置logo 有一道灰色边框
		BasicStroke stroke2 = new BasicStroke(1,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
		// 设置笔画对象
		graph.setStroke(stroke2);
		RoundRectangle2D.Float round2 = new RoundRectangle2D.Float(x, y, width, width,6,6);
		graph.setColor(new Color(128,128,128));
		graph.draw(round2);// 绘制圆弧矩形
		graph.dispose();
	}


	/**
	 * 生成二维码(内嵌LOGO)
	 *
	 * @param content
	 *            内容
	 * @param imgPath
	 *            LOGO地址
	 * @param destPath
	 *            存放目录
	 * @param needCompress
	 *            是否压缩LOGO
	 * @throws Exception
	 */
	public static void encode(String content, String imgPath, String destPath,
							  boolean needCompress) throws Exception {
		BufferedImage image = QRCodeUtil.createImage(content, imgPath,
				needCompress);
		mkdirs(destPath);
		String file = new Random().nextInt(99999999)+".jpg";
		ImageIO.write(image, FORMAT_NAME, new File(destPath+"/"+file));

	}


	public static void encode(String content, String imgPath, String destPath,
							  boolean needCompress,String filename) throws Exception {
		BufferedImage image = QRCodeUtil.createImage(content, imgPath,
				needCompress);
		mkdirs(destPath);
		String file = filename+".jpg";
		ImageIO.write(image, FORMAT_NAME, new File(destPath+"/"+file));

	}

	/**
	 * 生成二维码(内嵌LOGO) 输出指定验证码图片流
	 * @param content
	 * 			内容
	 * @param imgPath
	 * 			LOGO地址
	 * @param stream
	 * 			流
	 * @param needCompress
	 * 			 是否压缩LOGO
	 * @throws Exception
	 */
	public static void encodeStream(String content, File imgPath,OutputStream stream,
									boolean needCompress) throws Exception {
		BufferedImage image = QRCodeUtil.createImagebyfile(content, imgPath,
				needCompress);

		MatrixToImageWriter.writeToStreamByImg(image, "jpg", stream);
//		String file = new Random().nextInt(99999999)+".jpg";
//		ImageIO.write(image, FORMAT_NAME, new File(destPath+"/"+file));

	}



	/**
	 * 当文件夹不存在时，mkdirs会自动创建多层目录，区别于mkdir．(mkdir如果父目录不存在则会抛出异常)
	 * @param destPath
	 */
	public static void mkdirs(String destPath) {
		File file =new File(destPath);
		//当文件夹不存在时，mkdirs会自动创建多层目录，区别于mkdir．(mkdir如果父目录不存在则会抛出异常)
		if (!file.exists() && !file.isDirectory()) {
			file.mkdirs();
		}
	}

	/**
	 * 生成二维码(内嵌LOGO)
	 *
	 * @param content
	 *            内容
	 * @param imgPath
	 *            LOGO地址
	 * @param destPath
	 *            存储地址
	 * @throws Exception
	 */
	public static void encode(String content, String imgPath, String destPath)
			throws Exception {
		QRCodeUtil.encode(content, imgPath, destPath, false);
	}

	/**
	 * 生成二维码
	 *
	 * @param content
	 *            内容
	 * @param destPath
	 *            存储地址
	 * @param needCompress
	 *            是否压缩LOGO
	 * @throws Exception
	 */
	public static void encode(String content, String destPath,
							  boolean needCompress) throws Exception {
		QRCodeUtil.encode(content, null, destPath, needCompress);
	}

	/**
	 * 生成二维码
	 *
	 * @param content
	 *            内容
	 * @param destPath
	 *            存储地址
	 * @throws Exception
	 */
	public static void encode(String content, String destPath) throws Exception {
		QRCodeUtil.encode(content, null, destPath, false);
	}

	/**
	 * 生成二维码(内嵌LOGO)
	 *
	 * @param content
	 *            内容
	 * @param imgPath
	 *            LOGO地址
	 * @param output
	 *            输出流
	 * @param needCompress
	 *            是否压缩LOGO
	 * @throws Exception
	 */
	public static void encode(String content, String imgPath,
							  OutputStream output, boolean needCompress) throws Exception {
		BufferedImage image = QRCodeUtil.createImage(content, imgPath,
				needCompress);
		ImageIO.write(image, FORMAT_NAME, output);
	}

	/**
	 * 生成二维码
	 *
	 * @param content
	 *            内容
	 * @param output
	 *            输出流
	 * @throws Exception
	 */
	public static void encode(String content, OutputStream output)
			throws Exception {
		QRCodeUtil.encode(content, null, output, false);
	}




	/**
	 * 解析二维码
	 *
	 * @param file
	 *            二维码图片
	 * @return
	 * @throws Exception
	 */
	public static String decode(File file) throws Exception {
		BufferedImage image;
		image = ImageIO.read(file);
		if (image == null) {
			return null;
		}
		BufferedImageLuminanceSource source = new BufferedImageLuminanceSource(
				image);
		BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
		Result result;
		Hashtable<DecodeHintType, Object> hints = new Hashtable<DecodeHintType, Object>();
		hints.put(DecodeHintType.CHARACTER_SET, CHARSET);
		result = new MultiFormatReader().decode(bitmap, hints);
		String resultStr = result.getText();
		return resultStr;
	}

	/**
	 * 解析二维码
	 *
	 * @param path
	 *            二维码图片地址
	 * @return
	 * @throws Exception
	 */
	public static String decode(String path) throws Exception {
		return QRCodeUtil.decode(new File(path));
	}


	/**
	 * 解析二维码
	 * @param filePath
	 * 				图片路径
	 * @return String[] length=2
	 * 				[0]为数据 [1]为格式
	 */
	public static String[] read(String filePath) {
		// String filePath = "D://zxing.png";
		BufferedImage image;
		String []data=new String[2];
		try {
			image = ImageIO.read(new File(filePath));
			LuminanceSource source = new com.google.zxing.client.j2se.BufferedImageLuminanceSource(image);
			Binarizer binarizer = new HybridBinarizer(source);
			BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
			Map<DecodeHintType, Object> hints = new HashMap<DecodeHintType, Object>();
			hints.put(DecodeHintType.CHARACTER_SET, "UTF-8");
			Result result = new MultiFormatReader().decode(binaryBitmap, hints);// 对图像进行解码
			//System.out.println("图片中内容：  ");
			//	System.out.println("author： " + result.getText());
			data[0]=result.getText();
			//System.out.println("图片中格式：  ");
			//System.out.println("encode： " + result.getBarcodeFormat());
			data[1]= String.valueOf(result.getBarcodeFormat());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
		return data;
	}

	/**
	 * 解析二维码
	 * @param file
	 * 			file
	 * @return
	 * 			String[2]
	 * 			[0]为数据 [1]为格式
	 */
	public static String[] read(File file) {
		// String filePath = "D://zxing.png";
		BufferedImage image;
		String []data=new String[2];
		try {
			image = ImageIO.read(file);
			LuminanceSource source = new com.google.zxing.client.j2se.BufferedImageLuminanceSource(image);
			Binarizer binarizer = new HybridBinarizer(source);
			BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
			Map<DecodeHintType, Object> hints = new HashMap<DecodeHintType, Object>();
			hints.put(DecodeHintType.CHARACTER_SET, "UTF-8");
			Result result = new MultiFormatReader().decode(binaryBitmap, hints);// 对图像进行解码
			//System.out.println("图片中内容：  ");
			//	System.out.println("author： " + result.getText());
			data[0]=result.getText();
			//System.out.println("图片中格式：  ");
			//System.out.println("encode： " + result.getBarcodeFormat());
			data[1]= String.valueOf(result.getBarcodeFormat());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
		return data;
	}


	/**
	 * 生成无logo二维码
	 * @param content
	 * 			内容
	 * @param file
	 * 			文件
	 * @param width
	 * 			宽
	 * @param height
	 * 			高
	 * @param format
	 * 			格式  jpg png
	 */
	public static void encodeNologo(String content,File file,Integer width,Integer height,String format){

		try {
			MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
			Map hints = new HashMap();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			BitMatrix bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, width, height,hints);
			MatrixToImageWriter.writeToFile(bitMatrix, format, file);
		} catch (WriterException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 生成无logo二维码
	 * @param content
	 * 			内容
	 * @param filepath
	 * 			文件路径
	 * @param width
	 * 			宽
	 * @param height
	 * 			高
	 * @param format
	 * 			格式  jpg png
	 */
	public static void encodeNologo(String content,String filepath,Integer width,Integer height,String format){
		QRCodeUtil.encodeNologo(content,new File(filepath),width,height,format);
	}

	/**
	 * 生成无logo二维码 流
	 * @param content
	 * 			内容
	 * @param width
	 * @param height
	 * @param format
	 * 			格式  jpg png
	 * @param stream
	 * 			输出流
	 */
	public static void encodeStreamNologo(String content,Integer width,Integer height,String format,OutputStream stream){

		try {
			MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
			Map hints = new HashMap();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			BitMatrix bitMatrix = multiFormatWriter.encode(content, BarcodeFormat.QR_CODE, width, height,hints);
			MatrixToImageWriter.writeToStream(bitMatrix,format,stream);
		} catch (WriterException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	/**
	 * 根据配置文件获取相对或者绝对路径
	 * @return String
	 * @throws Exception
	 */
	public static String logopath()throws Exception{
		Integer logopath =null;
		String path=null;
		String basepath="";
		Properties prop = new Properties();
		InputStream in = TemplateUtils.class.getClassLoader().getResourceAsStream(
				"other.properties");
		prop.load(in);
		logopath= Integer.valueOf(prop.getProperty("QeUtilsLogoType"));
		path=prop.getProperty("QrUtilsLogoPath");
		if(logopath==1){
			basepath=Thread.currentThread().getContextClassLoader().getResource("").toString();
			String paths[]=basepath.split("file:/");
			basepath=paths[1]+path;
		}else {
			basepath=path;
		}

		return basepath;
	}

}
