package com.blog3.service;

import com.blog3.payload.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto getCommentsById(long postId, long commentId);

    List<CommentDto> getAllComments();

    void deleteCommentById(long postId, long commentId);

}
