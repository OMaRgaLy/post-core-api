package kz.dar.academy.service;

import kz.dar.academy.model.PostRequest;
import kz.dar.academy.model.PostResponse;

import java.util.List;

public interface PostService {
    void isWorkingCheck();

    PostResponse createPost(PostRequest postRequest);
    PostResponse updatePost(PostRequest postRequest);
    List<PostResponse> getAllPosts();
    PostResponse getPostById(String postId);
    void deletePostById(String postId);
}
