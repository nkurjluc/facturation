package projetSpring.facturation;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( {"projetSpring.facturation"} )
@EntityScan("projetSpring.facturation.entity.*")

public class FacturationApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(FacturationApplication.class, args);
	}

	

}