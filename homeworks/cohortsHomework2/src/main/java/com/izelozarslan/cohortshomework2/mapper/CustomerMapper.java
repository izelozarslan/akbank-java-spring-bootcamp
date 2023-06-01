package com.izelozarslan.cohortshomework2.mapper;

import com.izelozarslan.cohortshomework2.dto.customer.CustomerDTO;
import com.izelozarslan.cohortshomework2.dto.customer.CustomerSaveRequestDTO;
import com.izelozarslan.cohortshomework2.entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDTO toCustomerDTO (Customer customer);

    Customer toCustomer(CustomerSaveRequestDTO customerSaveRequestDTO);

    List<CustomerDTO> toCustomerDtoList(List<Customer> customerList);


}
