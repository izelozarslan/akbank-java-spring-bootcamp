package com.izelozarslan.homework1.controllers;

import com.izelozarslan.homework1.dto.CountryDTO;
import com.izelozarslan.homework1.dto.UpdateCountryDTO;
import com.izelozarslan.homework1.services.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/countries")
public class CountryController {

    private final CountryService countryService;

    @GetMapping
    public List<CountryDTO> getCountries() {
        return countryService.getAll();
    }

    @GetMapping("/{id}")
    public CountryDTO getCountryById(@PathVariable Long id) {
        return countryService.getCountryById(id);
    }

    @PostMapping
    public String saveCountry(@RequestBody CountryDTO countryDTO) {
        countryService.saveCountry(countryDTO);
        return "Country saved! " + countryDTO.name();
    }


    @PutMapping("/{id}")
    public String updatePresident(@PathVariable Long id, @RequestBody UpdateCountryDTO updateCountryDTO) {
        countryService.updatePresident(id, updateCountryDTO);
        return updateCountryDTO + " President updated!: " + id;

    }


}
