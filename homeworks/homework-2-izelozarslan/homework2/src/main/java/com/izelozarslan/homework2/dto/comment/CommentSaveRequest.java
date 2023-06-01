package com.izelozarslan.homework2.dto.comment;

public record CommentSaveRequest(String comment,
                                 Long productId,
                                 Long userId
                                 ) {
}
