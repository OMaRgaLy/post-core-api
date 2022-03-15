package kz.dar.academy.service;

import kz.dar.academy.model.PostModel;

import java.util.List;

public interface PostService {
    void isWorkingCheck();
    void createPost(PostModel postModel);
    List<PostModel> getAllPosts();
    PostModel getPostById(String postId);
    void updatePostById(String postId, PostModel postModel);
    void deletePostById(String postId);
}
