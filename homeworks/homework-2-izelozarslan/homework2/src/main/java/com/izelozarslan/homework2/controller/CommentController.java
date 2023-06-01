package com.izelozarslan.homework2.controller;

import com.izelozarslan.homework2.controller.contract.CommentControllerContract;
import com.izelozarslan.homework2.dto.comment.CommentDTO;
import com.izelozarslan.homework2.dto.comment.CommentSaveRequest;
import com.izelozarslan.homework2.general.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentControllerContract commentControllerContract;

    @GetMapping
    public ResponseEntity<RestResponse<List<CommentDTO>>> findAll() {
        List<CommentDTO> commentDTOList = commentControllerContract.findAll();
        return ResponseEntity.ok(RestResponse.of(commentDTOList));
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestResponse<CommentDTO>> findById(@PathVariable Long id) {
        CommentDTO commentDTO = commentControllerContract.findById(id);
        return ResponseEntity.ok(RestResponse.of(commentDTO));
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<RestResponse<List<CommentDTO>>> findByUserId(@PathVariable Long id) {
        List<CommentDTO> commentDTOList = commentControllerContract.findUserComments(id);
        return ResponseEntity.ok(RestResponse.of(commentDTOList));
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<RestResponse<List<CommentDTO>>> findByProductId(@PathVariable Long id) {
        List<CommentDTO> commentDTOList = commentControllerContract.findProductComments(id);
        return ResponseEntity.ok(RestResponse.of(commentDTOList));
    }

    @PostMapping
    public ResponseEntity<RestResponse<CommentDTO>> save(@RequestBody CommentSaveRequest commentSaveRequest) {
        CommentDTO commentDTO = commentControllerContract.save(commentSaveRequest);
        return ResponseEntity.ok(RestResponse.of(commentDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<Object>> deleteById(@PathVariable Long id) {
        commentControllerContract.deleteById(id);
        return ResponseEntity.ok(RestResponse.empty());
    }


}
