package com.izelozarslan.akbankbootcamp.controller.contract;

import com.izelozarslan.akbankbootcamp.dto.CustomerDTO;
import com.izelozarslan.akbankbootcamp.dto.CustomerSaveRequestDTO;

import java.util.List;

public interface CustomerControllerContract {

    CustomerDTO save(CustomerSaveRequestDTO requestDTO);

    List<CustomerDTO> findAll();

    void delete(Long id);
}
