package ch.keepcalm.react.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import java.util.Arrays;

@SpringBootApplication
@EnableAutoConfiguration
@EnableMongoAuditing
@EnableReactiveMongoRepositories
@Slf4j
public class ReactiveSpringAccountApplication implements CommandLineRunner {

    @Autowired
    ReactiveAccountRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ReactiveSpringAccountApplication.class, args);
	}

    @Override
    public void run(String...args) throws Exception {
        log.info("Application started with command-line arguments: {} . \n To kill this application, press Ctrl + C.", Arrays.toString(args));
        repository.save(Account.builder().amount(22.00).currency(Currency.EUR).build());
    }
}
