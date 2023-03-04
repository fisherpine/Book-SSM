package com.ggbz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration	 //这个注解替代xml文件中的初始数据
@ComponentScan({"com.ggbz.service"}) //设置bean扫描路径，多个路径书写为字符串数组格式
@PropertySource("classpath:Jdbc.properties")
//注意：这里面必须要加classpath
@Import({JdbcConfig.class,MyBatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
