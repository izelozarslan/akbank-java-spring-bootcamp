package com.izelozarslan.homework2.mapper;

import com.izelozarslan.homework2.dto.comment.CommentDTO;
import com.izelozarslan.homework2.dto.comment.CommentSaveRequest;
import com.izelozarslan.homework2.entity.Comment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommentMapper {

    List<CommentDTO> convertToCommentDtoList(List<Comment> commentList);

    CommentDTO convertToCommentDTO(Comment comment);

    Comment convertToComment(CommentSaveRequest commentSaveRequest);

}
