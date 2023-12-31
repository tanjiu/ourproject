package com.i1314i.ourproject.utils.jedisUtils.factory;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.FactoryBean;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 平行时空
 * @created 2018-06-14 22:15
 **/
public class JedisClusterFactory implements FactoryBean<JedisCluster> {

    //连接池参数 spring 注入
    private GenericObjectPoolConfig genericObjectPoolConfig=null;
    //
    private JedisCluster jedisCluster=null;
    private int connectionTimeout = 2000;
    private int soTimeout = 3000;
    private String passWord="";

    private int maxRedirections = 5;
    //redis结点列表 spring注入
    private Set<String> jedisClusterNodes;

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public JedisCluster getObject() throws Exception {
        return jedisCluster;
    }

    @Override
    public Class<?> getObjectType() {
        return (this.jedisCluster != null ? this.jedisCluster.getClass()
                : JedisCluster.class);
    }

    @Override
    public boolean isSingleton() {
        // TODO Auto-generated method stub
        return true;
    }

    public GenericObjectPoolConfig getGenericObjectPoolConfig() {
        return genericObjectPoolConfig;
    }

    public void setGenericObjectPoolConfig(
            GenericObjectPoolConfig genericObjectPoolConfig) {
        this.genericObjectPoolConfig = genericObjectPoolConfig;
    }

    public JedisCluster getJedisCluster() throws ParseException {
        //判断地址是否为空
        if(jedisClusterNodes == null || jedisClusterNodes.size() == 0){
            throw new NullPointerException("jedisClusterNodes is null.");
        }
        //构造结点
        Set<HostAndPort> haps = new HashSet<HostAndPort>();
        for(String node:jedisClusterNodes){
            String[] arr = node.split(":");
            if(arr.length != 2){
                throw new ParseException("node address error!", node.length()-1);
            }
            haps.add(new HostAndPort(arr[0],Integer.valueOf(arr[1])));
        }

        if(passWord.trim().equals("")){
            jedisCluster = new JedisCluster(haps, connectionTimeout, soTimeout, maxRedirections,genericObjectPoolConfig);
        }else {
                    jedisCluster = new JedisCluster(haps, connectionTimeout, soTimeout, maxRedirections, passWord,genericObjectPoolConfig);
        }


        return jedisCluster;
    }

    public void setJedisCluster(JedisCluster jedisCluster) {
        this.jedisCluster = jedisCluster;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public int getSoTimeout() {
        return soTimeout;
    }

    public void setSoTimeout(int soTimeout) {
        this.soTimeout = soTimeout;
    }

    public int getMaxRedirections() {
        return maxRedirections;
    }

    public void setMaxRedirections(int maxRedirections) {
        this.maxRedirections = maxRedirections;
    }

    public Set<String> getJedisClusterNodes() {
        return jedisClusterNodes;
    }

    public void setJedisClusterNodes(Set<String> jedisClusterNodes) {
        this.jedisClusterNodes = jedisClusterNodes;
    }
}
