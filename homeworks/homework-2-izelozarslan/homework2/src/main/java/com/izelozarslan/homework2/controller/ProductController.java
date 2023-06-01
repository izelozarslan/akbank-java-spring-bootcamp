package com.izelozarslan.homework2.controller;

import com.izelozarslan.homework2.controller.contract.ProductControllerContract;
import com.izelozarslan.homework2.dto.product.ProductDTO;
import com.izelozarslan.homework2.dto.product.ProductSaveRequest;
import com.izelozarslan.homework2.dto.product.ProductUpdatePriceRequest;
import com.izelozarslan.homework2.general.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductControllerContract productControllerContract;

    @PostMapping
    public ResponseEntity<RestResponse<ProductDTO>> save(@RequestBody ProductSaveRequest productSaveRequest){
        var productDTO = productControllerContract.save(productSaveRequest);
        return ResponseEntity.ok(RestResponse.of(productDTO));
    }

    @GetMapping
    public ResponseEntity<RestResponse<List<ProductDTO>>> findAll(){
        List<ProductDTO> productDTOList = productControllerContract.findAll();
        return ResponseEntity.ok(RestResponse.of(productDTOList));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<ProductDTO>> findById(@PathVariable Long id){
        ProductDTO productDTO = productControllerContract.findById(id);
        return ResponseEntity.ok(RestResponse.of(productDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<Object>> deleteById(@PathVariable Long id){
        productControllerContract.deleteById(id);
        return ResponseEntity.ok(RestResponse.empty());
    }

    @PutMapping("/{id}")
    public ResponseEntity<RestResponse<ProductDTO>> updatePriceById(@PathVariable Long id, @RequestBody ProductUpdatePriceRequest request){
        ProductDTO productDTO = productControllerContract.updatePriceById(id, request);
        return ResponseEntity.ok(RestResponse.of(productDTO));
    }
}


