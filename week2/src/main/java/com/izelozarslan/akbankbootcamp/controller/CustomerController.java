package com.izelozarslan.akbankbootcamp.controller;

import com.izelozarslan.akbankbootcamp.controller.contract.CustomerControllerContract;
import com.izelozarslan.akbankbootcamp.dto.CustomerDTO;
import com.izelozarslan.akbankbootcamp.dto.CustomerSaveRequestDTO;
import com.izelozarslan.akbankbootcamp.general.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerControllerContract customerControllerContract;

    @PostMapping
    public ResponseEntity<RestResponse<CustomerDTO>> save(@RequestBody CustomerSaveRequestDTO customerSaveRequestDTO) {
        var customerDTO = customerControllerContract.save(customerSaveRequestDTO);
        return ResponseEntity.ok(RestResponse.of(customerDTO));
    }

    @GetMapping
    public ResponseEntity<RestResponse<List<CustomerDTO>>> findAll() {
        var customerDTOList = customerControllerContract.findAll();
        return ResponseEntity.ok(RestResponse.of(customerDTOList));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<Object>> delete(@PathVariable Long id) {
        customerControllerContract.delete(id);
        return ResponseEntity.ok(RestResponse.empty());
    }

}
