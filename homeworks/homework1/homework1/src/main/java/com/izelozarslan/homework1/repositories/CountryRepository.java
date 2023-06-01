package com.izelozarslan.homework1.repositories;

import com.izelozarslan.homework1.dto.CountryDTO;

import com.izelozarslan.homework1.entities.Country;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class CountryRepository {
    public ArrayList<CountryDTO> countryDTO;
    ArrayList<Country> countries;

    public CountryRepository() {
        countries = new ArrayList<Country>();
        countries.add(new Country(1L, "United States", "Joe Biden"));
        countries.add(new Country(2L, "United Kingdom", "Boris Johnson"));
        countries.add(new Country(3L, "France", "Emmanuel Macron"));
        countries.add(new Country(4L, "Germany", "Frank-Walter Steinmeier"));
        countries.add(new Country(5L, "Russia", "Vladimir Putin"));
        countries.add(new Country(6L, "China", "Xi Jinping"));
        countries.add(new Country(7L, "Canada", "Justin Trudeau"));
        countries.add(new Country(8L, "Australia", "Scott Morrison"));
        countries.add(new Country(9L, "India", "Ram Nath Kovind"));
        countries.add(new Country(10L, "Brazil", "Jair Bolsonaro"));

    }

    public CountryRepository(ArrayList<CountryDTO> countryDTO) {
        this.countryDTO = countryDTO;
    }

    public ArrayList<Country> getAll() {
        return countries;
    }

    public Country getCountryById(Long id) {
        for (Country country : countries) {
            if (country.getId().equals(id)) {
                return country;
            }
        }
        return null;
    }

    public String saveCountry(Country country) {
        countries.add(country);
        return "Country saved!" + country;
    }


}
