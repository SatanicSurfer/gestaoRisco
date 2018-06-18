package br.com.xxxcompany.web.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import br.com.xxxcompany.app.config.DataBaseConfig;

public class ClienteWebAppInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
	      AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
	      
	      webContext.register(DataBaseConfig.class);
	      webContext.register(ClienteWebMVCConfig.class);
	      webContext.setServletContext(ctx);
	      ServletRegistration.Dynamic reg=ctx.addServlet("dispatcherServlet", new DispatcherServlet(webContext));
	      reg.setLoadOnStartup(1);
	      reg.addMapping("*.action");
		
	}

}
