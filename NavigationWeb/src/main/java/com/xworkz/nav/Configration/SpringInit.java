package com.xworkz.nav.Configration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInit
extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("creating getRootConfigClasses...");
		Class [] ref= {SpringBeanConfigration.class};
		return ref;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running in getServletConfigClasses");
		Class[] server= {SpringBeanConfigration.class};
		return server;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running in getServeletMap");
		String[] ref= {"/"};
		
		return ref;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running configr Default ServeletHandling");
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}

}
