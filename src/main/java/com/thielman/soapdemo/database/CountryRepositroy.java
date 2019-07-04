package com.thielman.soapdemo.database;

import com.generated.Country;
import com.generated.Currency;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class CountryRepositroy {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country country = new Country();
        country.setName("Spain");
        country.setCapital("Madrid");
        country.setPopulation(20000000);
        country.setCurrency(Currency.EUR);
        countries.put(country.getName(), country);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }

}
