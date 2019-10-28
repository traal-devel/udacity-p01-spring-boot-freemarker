package ch.traal.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@SpringBootApplication
public class SpringBootFreemakerApplication {

  
  /* methods */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootFreemakerApplication.class, args);
	}
	
	@Bean 
	public FreeMarkerViewResolver freemarkerViewResolver() { 
    FreeMarkerViewResolver resolver = new FreeMarkerViewResolver(); 
    resolver.setCache(true); 
    resolver.setPrefix(""); 
    resolver.setSuffix(".ftl"); 
    return resolver; 
	}

}
