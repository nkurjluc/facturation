package projetSpring.facturation;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@SpringBootApplication
@ComponentScan( {"projetSpring.facturation"} )
@EntityScan("projetSpring.facturation.entity.*")
@EnableJpaRepositories("projetSpring.facturation.repository.*")

public class FacturationApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(FacturationApplication.class, args);
	}

	

}