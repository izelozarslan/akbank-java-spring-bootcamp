package com.izelozarslan.homework1.services;

import com.izelozarslan.homework1.dto.CountryDTO;
import com.izelozarslan.homework1.dto.UpdateCountryDTO;
import com.izelozarslan.homework1.entities.Country;
import com.izelozarslan.homework1.mappers.CountryMapper;
import com.izelozarslan.homework1.repositories.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;
    private final CountryMapper countryMapper;


    public List<CountryDTO> getAll() {

        return countryMapper.toDTOs(countryRepository.getAll());
    }


    public String saveCountry(CountryDTO countryDTO) {
        Country country = countryMapper.toEntity(countryDTO);
        countryRepository.saveCountry(country);
        return "Country saved! " + country;
    }


    public String updatePresident(Long id, UpdateCountryDTO updateCountryDTO) {
        Country country = countryRepository.getCountryById(id);
        country.setPresident(updateCountryDTO.president());
        countryRepository.saveCountry(country);
        return "President updated!";
    }


    public CountryDTO getCountryById(Long id) {
        Country country = countryRepository.getCountryById(id);
        return countryMapper.toDTO(country);
    }
}