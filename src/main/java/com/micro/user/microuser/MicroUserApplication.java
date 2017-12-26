package com.micro.user.microuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MicroUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroUserApplication.class, args);
	}
}
