package com.i1314i.ourproject;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.i1314i.ourproject.utils.xss.XssSqlStringJsonSerializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages="com.i1314i.ourproject")
@EnableTransactionManagement
@EnableScheduling
@EnableCaching  //开启缓存
public class WebappApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}
	@Override
    //打包war包需要配置这个，继承
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());

	}
	@Bean
	@Primary
	public ObjectMapper xssObjectMapper(Jackson2ObjectMapperBuilder builder) {
		// 解析器
		ObjectMapper objectMapper = builder.createXmlMapper(false).build();
		// 注册XSS SQL 解析器
		SimpleModule xssModule = new SimpleModule("XssStringJsonSerializer");
		xssModule.addSerializer(new XssSqlStringJsonSerializer());
		objectMapper.registerModule(xssModule);
		return objectMapper;
	}
}
