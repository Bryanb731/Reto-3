package reto_3.reto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"reto_3.reto.modelo"})
@SpringBootApplication
public class RetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoApplication.class, args);
	}

}
