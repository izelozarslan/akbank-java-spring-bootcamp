package com.izelozarslan.homework1.mappers;

import com.izelozarslan.homework1.entities.Country;
import com.izelozarslan.homework1.dto.CountryDTO;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CountryMapper {

    CountryDTO toDTO(Country country);

    Country toEntity(CountryDTO countryDTO);

    List<CountryDTO> toDTOs(List<Country> countries);
}
