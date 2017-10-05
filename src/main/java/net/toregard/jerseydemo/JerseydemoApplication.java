package net.toregard.jerseydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class JerseydemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(applicationClass, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

    private static Class<JerseydemoApplication> applicationClass = JerseydemoApplication.class;
}

/*
public class JerseydemoApplication extends RepositoryRestConfigurerAdapter {

	public static void main(String[] args) {
		new SpringApplicationBuilder(JerseydemoApplication.class).
				initializers(new SpringApplicationContextInitializer())
				.application()
				.run(args);
	}
}
 */
