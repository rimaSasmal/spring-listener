package com.petals.listener;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringListenerApplication.class, args);

	}

}
