package com.example.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.data.r2dbc.R2dbcDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.apache.commons.dbcp2.BasicDataSource;
import org.jooq.impl.DataSourceConnectionProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;

@Configuration
//@Configuration(exclude = {HibernateJpaAutoConfiguration.class, R2dbcDataAutoConfiguration.class, DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class DBConfig {

    @Value("${jdbcUrl}")
    private String jdbcUrl;

    @Value("${dbUsername}")
    private String username;

    @Value("${password}")
    private String password;

    @Bean(destroyMethod = "close")
    DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    @Bean(name = "transactionManager")
    DataSourceTransactionManager getDataSourceTransactionManager() {
        return new DataSourceTransactionManager(getDataSource());
    }

    @Bean(name = "transactionAwareDataSource")
    TransactionAwareDataSourceProxy getTransactionAwareDataSourceProxy() {
        return new TransactionAwareDataSourceProxy(getDataSource());
    }

    @Bean(name = "connectionProvider")
    DataSourceConnectionProvider getDataSourceConnectionProvider() {
        return new DataSourceConnectionProvider(getTransactionAwareDataSourceProxy());
    }
}
