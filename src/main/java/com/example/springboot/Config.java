package com.example.springboot;

import com.example.springboot.service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

@Configuration
public class Config {

//    @Value("${jdbcUrl}")
    String jdbcUrl = "jdbc:mysql://test-database.ce0vu1pvbvzt.ap-south-1.rds.amazonaws.com/movies";

//    @Value("${dbUsername}")
    String username = "ps06756";

//    @Value("${dbPassword}")
    String password = "Hello123321";

    @Bean
    public HelloAccessor createHelloAccessor() {
        return new HelloAccessor("This accessor was created inside config!");
    }

    @Bean
    public HelloService createHelloService(HelloAccessor helloAccessor) {
        return new HelloService(helloAccessor);
    }

//    DataSource getDataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setUrl(jdbcUrl);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        return dataSource;
//    }
}
