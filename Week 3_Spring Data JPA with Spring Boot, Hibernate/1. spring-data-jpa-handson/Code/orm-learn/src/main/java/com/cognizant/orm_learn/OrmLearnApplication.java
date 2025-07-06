package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		testFindCountryByCode("IN");  // You can change this to any country code
	}

	private void testFindCountryByCode(String code) {
		LOGGER.info("Start");
		try {
			Country country = countryService.findCountryByCode(code);
			LOGGER.debug("Country: {}", country.getName());  // Only print country name
		} catch (CountryNotFoundException e) {
			LOGGER.error("Error: {}", e.getMessage());
		}
		LOGGER.info("End");
	}
}
