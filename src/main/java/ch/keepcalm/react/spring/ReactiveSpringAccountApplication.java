package ch.keepcalm.react.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableMongoAuditing
@EnableReactiveMongoRepositories
public class ReactiveSpringAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveSpringAccountApplication.class, args);
	}
}
