package com.izelozarslan.homework2.controller.contract.impl;

import com.izelozarslan.homework2.controller.contract.ProductControllerContract;
import com.izelozarslan.homework2.dto.product.ProductDTO;
import com.izelozarslan.homework2.dto.product.ProductSaveRequest;
import com.izelozarslan.homework2.dto.product.ProductUpdatePriceRequest;
import com.izelozarslan.homework2.entity.Product;
import com.izelozarslan.homework2.mapper.ProductMapper;
import com.izelozarslan.homework2.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductControllerContractImpl implements ProductControllerContract {

    private final ProductService productService;
    private final ProductMapper mapper;

    @Override
    public ProductDTO save(ProductSaveRequest productSaveRequest) {
        Product product = mapper.convertToProduct(productSaveRequest);
        productService.save(product);
        return mapper.convertToProductDTO(product);
    }

    @Override
    public List<ProductDTO> findAll() {
        List<Product> productList = productService.findAll();
        return mapper.convertToProductDTOList(productList);

    }

    @Override
    public ProductDTO findById(Long id) {
        Product product = productService.findByIdWithControl(id);
        return mapper.convertToProductDTO(product);
    }

    @Override
    public void deleteById(Long id) {
        productService.deleteById(id);
    }

    @Override
    public ProductDTO updatePriceById(Long id, ProductUpdatePriceRequest request) {
        Product product = productService.findByIdWithControl(id);
        product.setPrice(request.price());
        productService.save(product);
        return mapper.convertToProductDTO(product);
    }
}
