package com.test.democompliance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;




@SpringBootApplication
@ComponentScan(basePackages = "com")
@EnableAsync
public class DemocomplianceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemocomplianceApplication.class, args);
	}

}
