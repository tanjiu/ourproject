package com.i1314i.ourproject.config;


import com.i1314i.ourproject.utils.jedisUtils.IJedisClient;
import com.i1314i.ourproject.utils.jedisUtils.JedisClient;
import com.i1314i.ourproject.utils.jedisUtils.JedisClusterClient;
import com.i1314i.ourproject.utils.jedisUtils.factory.JedisClusterFactory;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import redis.clients.jedis.JedisCluster;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

/**
 * Jedis相关
 * @author 平行时空
 * @created 2018-09-17 21:27
 **/

@Configuration
@PropertySource(value= "classpath:dao.properties",encoding = "UTF-8")
public class JedisConfig {
    private static JedisClusterFactory jedisClusterFactory=null;
    private static GenericObjectPoolConfig config=null;
    private static Set<String> jedisClusterNodes=null;

    /**
     * redis过期时间,以秒为单位
     */
    public final static int EXRP_HOUR = 60*60;          //一小时
    public final static int EXRP_DAY = 60*60*24;        //一天
    public final static int EXRP_MONTH = 60*60*24*30;   //一个月
    public final static int EXRP_YEAR = 60*60*24*30*12;   //一个年

    @Value("${jedis.cluster.address}")
    private  String jedisaddress;
    @Value("${jedis.cluster.password}")
    private  String password;


    /**
     * 单机redis
     * @return
     */
    @Bean
    public IJedisClient jedisClient(){
        return new JedisClient();
    }


    /**
     * redis集群相关
     * @return
     * @throws ParseException
     */

//    @Bean
    public JedisCluster jedisCluster() throws ParseException {
        jedisClusterFactory=new JedisClusterFactory();
        config=new GenericObjectPoolConfig();
        config.setMaxTotal(1000);
        config.setMinIdle(20);
        jedisClusterFactory.setSoTimeout(10000000);
        jedisClusterFactory.setConnectionTimeout(10000000);
        jedisClusterFactory.setPassWord(password);
        jedisClusterNodes=new HashSet<>();
        String[]jedisclusteraddress=jedisaddress.split(",");
        for (String address:
                jedisclusteraddress) {
            System.out.println(address);
            jedisClusterNodes.add(address);
        }

        jedisClusterFactory.setJedisClusterNodes(jedisClusterNodes);
        jedisClusterFactory.setGenericObjectPoolConfig(config);
        return jedisClusterFactory.getJedisCluster();
    }

    //    @Bean
    public IJedisClient jedisClusterClient(){
        return new JedisClusterClient();
    }

}
