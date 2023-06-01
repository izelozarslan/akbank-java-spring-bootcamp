package com.izelozarslan.akbankbootcamp.mapper;

import com.izelozarslan.akbankbootcamp.dto.CustomerDTO;
import com.izelozarslan.akbankbootcamp.dto.CustomerSaveRequestDTO;
import com.izelozarslan.akbankbootcamp.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    Customer convertToCustomer(CustomerSaveRequestDTO customerSaveRequestDTO);

    CustomerDTO convertToCustomerDTO(Customer customer);

    List<CustomerDTO> convertToCustomerDTOList(List<Customer> customerList );
}
