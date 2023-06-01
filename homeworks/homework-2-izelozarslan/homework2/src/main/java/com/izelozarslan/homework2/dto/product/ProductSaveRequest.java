package com.izelozarslan.homework2.dto.product;

import java.math.BigDecimal;

public record ProductSaveRequest(String name,
                                 BigDecimal price,
                                 String description
                                 ) {
}
