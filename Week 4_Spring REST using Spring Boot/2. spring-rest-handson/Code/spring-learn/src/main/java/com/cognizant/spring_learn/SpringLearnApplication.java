package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@SpringBootApplication
public class SpringLearnApplication {

	public static void displayCountry() {
		Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
		LOGGER.info("START");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		try {
			Country country = context.getBean("country", Country.class);
			LOGGER.debug("Country : {}", country.toString());  // DEBUG LOG TO CHECK
		} finally {
			context.close();
		}

		LOGGER.info("END");
	}




	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
//		displayCountry();
	}

}


