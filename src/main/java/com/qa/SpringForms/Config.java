package com.qa.SpringForms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

//Identify as a configuration
@Configuration
//Specifies which package to scan for controllers
@ComponentScan("com.qa")
public class Config {
	
	//create a javabean to resolve the views as they are asked for.
	//this method tells spring that it can find all the jsp files in the 
	//WEB-INF/views folder and they will have the file type of jsp. 
	@Bean
	public UrlBasedViewResolver setupViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}
}

