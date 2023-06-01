package com.izelozarslan.homework2.controller.contract;

import com.izelozarslan.homework2.dto.comment.CommentDTO;
import com.izelozarslan.homework2.dto.comment.CommentSaveRequest;

import java.util.List;

public interface CommentControllerContract {

    List<CommentDTO> findAll();

    CommentDTO findById(Long id);

    CommentDTO save(CommentSaveRequest commentSaveRequest);

    void deleteById(Long id);

    List<CommentDTO> findUserComments(Long customerId);

    List<CommentDTO> findProductComments(Long productId);
}
