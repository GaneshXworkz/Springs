package com.xworkz.hotel.Configration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInit extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("creating getServletConfigClasses");
		return new Class[] {SpringConfgration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("created getServletMappings");
		return new String[] {"/"};
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("created configureDefaultServletHandling");
		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}
}
