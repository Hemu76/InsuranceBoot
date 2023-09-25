package com.Insurance.Claims.Insurance.Configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.Insurance.Claims.Insurance")
public class AppConfiguration {
	@Bean
	DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl("jdbc:postgresql://192.168.110.48/plf_training");
		driverManagerDataSource.setUsername("plf_training_admin");
		driverManagerDataSource.setPassword("pff123");
		driverManagerDataSource.setDriverClassName("org.postgresql.Driver");
		return driverManagerDataSource;
	}
}
