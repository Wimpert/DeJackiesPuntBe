package be.dejackies.jackiessite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class JackiessiteApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JackiessiteApplication.class, args);

	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("Starting");
		return application.sources(applicationClass);
	}

	private static Class<JackiessiteApplication> applicationClass = JackiessiteApplication.class;
}
