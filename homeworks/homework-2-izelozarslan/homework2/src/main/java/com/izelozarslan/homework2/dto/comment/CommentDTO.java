package com.izelozarslan.homework2.dto.comment;

public record CommentDTO(Long id,
                         String comment,
                         Long productId,
                         Long userId
                         ) {
}
