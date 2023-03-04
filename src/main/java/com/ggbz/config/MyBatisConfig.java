package com.ggbz.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

public class MyBatisConfig {
    @Bean                                 //这个dataSource是Spring根据类型自动装配的
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setTypeAliasesPackage("com.ggbz.domain");
        //设置类型别名扫描包
        return factoryBean;
    }


    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.ggbz.dao");
        //basePackage：这个属性就是映射接口的包，这个包里面的所有的接口扫描到
        //然后动态实现接口并注入到spring容器中，所以不需要加@Repository
        return msc;
    }
}
