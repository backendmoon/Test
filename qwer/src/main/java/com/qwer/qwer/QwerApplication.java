package com.qwer.qwer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
public class QwerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QwerApplication.class, args);
	}

}
