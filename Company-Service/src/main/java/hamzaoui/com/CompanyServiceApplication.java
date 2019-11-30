package hamzaoui.com;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import hamzaoui.com.dao.CompanyRepository;
import hamzaoui.com.entities.Company;

@SpringBootApplication(exclude=SecurityAutoConfiguration.class) //@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class CompanyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceApplication.class, args);		
	}
	@Bean
	CommandLineRunner start(CompanyRepository companyRepository) {
		return args->{
			Stream.of("A","B","C").forEach(cn->{
				companyRepository.save(new Company(null,cn,100+Math.random()*900));
			});
			companyRepository.findAll().forEach(System.out::println);
		};
	}

}
