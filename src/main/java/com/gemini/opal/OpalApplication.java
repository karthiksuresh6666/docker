package com.gemini.opal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.gemini.opal")
@SpringBootApplication
public class OpalApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpalApplication.class, args);
	}

}
