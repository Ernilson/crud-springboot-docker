package br.com.Docker2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "br.com.Docker2")
//@EntityScan(basePackages = "br.com.Docker.Model")
public class Docker2Application {

	public static void main(String[] args) {
		SpringApplication.run(Docker2Application.class, args);
	}

}
