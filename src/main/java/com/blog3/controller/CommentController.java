package com.blog3.controller;

import com.blog3.payload.CommentDto;
import com.blog3.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@PathVariable(value = "postId") long postId, @RequestBody CommentDto commentDto){
        CommentDto dto = commentService.createComment(postId, commentDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    @GetMapping("/posts/{postId}/comments")
    public List<CommentDto> getCommentsByPostId(@PathVariable(value = "postId") long postId){
        List<CommentDto> commentDtos = commentService.getCommentsByPostId(postId);
        return commentDtos;
    }

    @GetMapping("/posts/{postId}/comments/{commentId}")
    public CommentDto getCommentsById(@PathVariable(value = "postId") long postId, @PathVariable(value = "commentId") long commentId){
        CommentDto commentDto = commentService.getCommentsById(postId, commentId);
        return commentDto;
    }

    @GetMapping("/comments")
    public List<CommentDto> getAllComments(){
        List<CommentDto> commentDto = commentService.getAllComments();
        return commentDto;
    }


    @DeleteMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<String> deleteCommentById(@PathVariable(value = "postId") long postId, @PathVariable("commentId") long commentId){
        commentService.deleteCommentById(postId, commentId);
        return new ResponseEntity<>("Comment is deleted", HttpStatus.OK);
    }




}
