package br.com.gabriel.springRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.gabriel.springRest")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
