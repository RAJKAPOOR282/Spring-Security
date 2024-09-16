package com.Rajkapoor.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(SpringdemoApplication.class, args);
	StudentBean s=context.getBean(StudentBean.class);
	s.disp();
//	StudentBean s1=context.getBean(StudentBean.class);
//	s.disp();
//		System.out.println("Welcome");
	}

}