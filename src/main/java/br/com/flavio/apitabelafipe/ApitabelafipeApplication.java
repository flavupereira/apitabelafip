package br.com.flavio.apitabelafipe;

import br.com.flavio.apitabelafipe.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApitabelafipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApitabelafipeApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.menu();
	}
}
