package com.xworkz.airoplane.Configration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	public SpringInit() {
		System.out.println("Created :"+this.getClass().getSimpleName());
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Created getRootConfigClasses" );
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Created getServletConfigClasses");
		return new Class[] {SpringConfigration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("created getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("created configureDefaultServletHandling");
		configurer.enable();
	}
	
}
