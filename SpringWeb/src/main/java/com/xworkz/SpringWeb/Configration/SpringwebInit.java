package com.xworkz.SpringWeb.Configration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringwebInit extends AbstractAnnotationConfigDispatcherServletInitializer 
implements WebMvcConfigurer{

	public SpringwebInit() {
		System.out.println("Creating :"+this.getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running in getRootConfigClasses");	
		Class [] ref= {SpringBeanConfigration.class};
		return ref;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running in getServletMappings");
		String[] ref= {"/"};
		return ref;
	}
	
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running in getServletMappings");
		Class[] server={SpringBeanConfigration.class};
		return server;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running configure Default serveletHandling");
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}

}
