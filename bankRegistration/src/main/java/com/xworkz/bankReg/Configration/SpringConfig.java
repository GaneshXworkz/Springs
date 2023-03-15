package com.xworkz.bankReg.Configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.bankReg")
public class SpringConfig {

	public SpringConfig() {
		System.out.println("Confogration is running.......!");
	}
	
	
	@Bean
	public MultipartResolver multipartResolver() {
		System.out.println("registering multipartResolver");
		return new StandardServletMultipartResolver();
		//used to process html-form which is enctype
	}
	

	@Bean
	@Order(1)
	public ViewResolver viewResolver() {
		System.out.println("Running View Resolver......!");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("regstring LocalContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		return bean;
	}
	
	// 

}
