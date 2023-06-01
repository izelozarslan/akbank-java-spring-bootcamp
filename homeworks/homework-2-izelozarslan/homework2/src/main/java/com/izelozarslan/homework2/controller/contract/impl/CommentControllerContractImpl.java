package com.izelozarslan.homework2.controller.contract.impl;

import com.izelozarslan.homework2.controller.contract.CommentControllerContract;
import com.izelozarslan.homework2.dto.comment.CommentDTO;
import com.izelozarslan.homework2.dto.comment.CommentSaveRequest;
import com.izelozarslan.homework2.entity.Comment;
import com.izelozarslan.homework2.errormessages.CommentErrorMessage;
import com.izelozarslan.homework2.general.ItemNotFoundException;
import com.izelozarslan.homework2.mapper.CommentMapper;
import com.izelozarslan.homework2.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentControllerContractImpl implements CommentControllerContract {

    private final CommentService commentService;
    private final CommentMapper mapper;

    @Override
    public List<CommentDTO> findAll() {
        List<Comment> commentList = commentService.findAll();
        return mapper.convertToCommentDtoList(commentList);
    }

    @Override
    public CommentDTO findById(Long id) {
        Comment comment = commentService.findByIdWithControl(id);
        return mapper.convertToCommentDTO(comment);

    }

    @Override
    public CommentDTO save(CommentSaveRequest commentSaveRequest) {
        Comment comment = mapper.convertToComment(commentSaveRequest);
        commentService.save(comment);
        return mapper.convertToCommentDTO(comment);
    }

    @Override
    public void deleteById(Long id) {
        commentService.deleteById(id);
    }

    @Override
    public List<CommentDTO> findUserComments(Long id) {
        List<Comment> commentList = commentService.findCommentsByUserId(id);
        if (commentList.isEmpty()){
            throw new ItemNotFoundException(CommentErrorMessage.COMMENT_DOES_NOT_EXISTS_CUSTOMER);
        }
        return mapper.convertToCommentDtoList(commentList);
    }

    @Override
    public List<CommentDTO> findProductComments(Long id) {
        List<Comment> commentList = commentService.findCommentsByProductId(id);
        if (commentList.isEmpty()){
            throw new ItemNotFoundException(CommentErrorMessage.COMMENT_DOES_NOT_EXISTS_PRODUCT);
        }
        return mapper.convertToCommentDtoList(commentList);
    }
}
