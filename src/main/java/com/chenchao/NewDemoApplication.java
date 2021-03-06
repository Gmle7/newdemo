package com.chenchao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class NewDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewDemoApplication.class, args);
	}

	/**
	 * 打印所有自动注入的bean
	 * @param ctx
	 * @return
	 */
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args->{
			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName: beanNames) {
				System.out.println(beanName);
			}
		};
	}
}
