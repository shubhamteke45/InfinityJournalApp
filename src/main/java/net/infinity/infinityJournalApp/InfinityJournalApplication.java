package net.infinity.infinityJournalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableTransactionManagement
public class InfinityJournalApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfinityJournalApplication.class, args);
	}

	@Bean
	public PlatformTransactionManager transactionManager(MongoDatabaseFactory mongoDatabaseFactory){
		return new MongoTransactionManager(mongoDatabaseFactory);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
