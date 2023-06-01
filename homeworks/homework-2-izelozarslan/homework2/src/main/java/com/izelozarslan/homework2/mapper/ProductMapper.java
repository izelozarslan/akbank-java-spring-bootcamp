package com.izelozarslan.homework2.mapper;

import com.izelozarslan.homework2.dto.product.ProductDTO;
import com.izelozarslan.homework2.dto.product.ProductSaveRequest;
import com.izelozarslan.homework2.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product convertToProduct(ProductSaveRequest productSaveRequest);

    ProductDTO convertToProductDTO(Product product);

    List<ProductDTO> convertToProductDTOList(List<Product> productList);

    List<Product> convertToProductList(List<ProductDTO> productDTOListDTO);
}
