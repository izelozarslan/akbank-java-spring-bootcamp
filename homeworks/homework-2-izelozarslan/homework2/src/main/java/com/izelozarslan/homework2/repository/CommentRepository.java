package com.izelozarslan.homework2.repository;

import com.izelozarslan.homework2.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findCommentsByUserId(Long userId);
    List<Comment> findCommentsByProductId(Long productId);
}
