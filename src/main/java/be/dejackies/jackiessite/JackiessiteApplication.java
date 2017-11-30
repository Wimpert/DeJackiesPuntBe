package be.dejackies.jackiessite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class JackiessiteApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JackiessiteApplication.class, args);

	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(applicationClass);
	}

	private static Class<JackiessiteApplication> applicationClass = JackiessiteApplication.class;
}
