package com.qa.SpringForms;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInit implements WebApplicationInitializer {

	// Run when the web application is initialised and loaded to the server
	public void onStartup(ServletContext servletContext) throws ServletException {

		// specify the root context for this class
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();

		// tell the context where to find configuration classes
		rootContext.register(Config.class);
		
		rootContext.refresh();

		// set the servlet context
		rootContext.setServletContext(servletContext);

		// Map the root directory "/" to this project, whenever any traffic
		// comes in on localhost:8080/ the information
		// will be passed to the root context.
		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(rootContext));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);

	}
}
