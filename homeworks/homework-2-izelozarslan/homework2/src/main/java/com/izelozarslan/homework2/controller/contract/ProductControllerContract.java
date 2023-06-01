package com.izelozarslan.homework2.controller.contract;

import com.izelozarslan.homework2.dto.product.ProductDTO;
import com.izelozarslan.homework2.dto.product.ProductSaveRequest;
import com.izelozarslan.homework2.dto.product.ProductUpdatePriceRequest;

import java.util.List;

public interface ProductControllerContract {

    ProductDTO save(ProductSaveRequest productSaveRequest);

    List<ProductDTO> findAll();

    ProductDTO findById(Long id);

    void deleteById(Long id);

    ProductDTO updatePriceById(Long id, ProductUpdatePriceRequest productUpdatePriceRequest);
}
