package be.dejackies.jackiessite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class JackiessiteApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("Starting");
		return application.sources(JackiessiteApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JackiessiteApplication.class, args);

	}





}
