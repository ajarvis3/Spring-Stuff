package com.example.consume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumeApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumeApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		var apiUrl = "https://cat-fact.herokuapp.com/facts";
		return args -> {
			Cats[] cats = restTemplate.getForObject(
				apiUrl, Cats[].class
			);
			for (Cats cat: cats) {
				log.info(cat.toString());
			}
		}; 
		// return args -> {
		// 	Quote quote = restTemplate.getForObject(
		// 			"https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		// 	log.info(quote.toString());
		// };
	}

}
