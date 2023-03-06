package com.xworkz.bankReg.Configration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInt extends 
AbstractAnnotationConfigDispatcherServletInitializer 
implements WebMvcConfigurer{
	
	public WebInt() {
		System.out.println("Running WebInt.......!");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses....!");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses....!");
		return new Class[] {SpringConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings....!");
		return new String[] {"/"};	
		
		}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	System.out.println("created configureDefaultServletHandling");
	configurer.enable();
	
	}	

}
