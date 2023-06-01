package com.izelozarslan.homework2.service;

import com.izelozarslan.homework2.entity.Product;
import com.izelozarslan.homework2.general.BaseEntityService;
import com.izelozarslan.homework2.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends BaseEntityService<Product, ProductRepository> {

    public ProductService(ProductRepository repository) {
        super(repository);
    }
}
