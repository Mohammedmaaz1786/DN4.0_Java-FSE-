package com.cognizant.orm_learn.service;

import java.util.List;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;

public interface CountryService {
    Country findCountryByCode(String code) throws CountryNotFoundException;
    Country addCountry(Country country);
    Country updateCountry(Country country);
    void deleteCountry(String code);
    List<Country> searchCountriesByName(String name);
}

