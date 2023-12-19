package br.com.decolejáviagens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringDecoleJáViagensApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDecoleJáViagensApplication.class, args);
		
		System.out.println("Aplicação rodando...");
		
	}

}
