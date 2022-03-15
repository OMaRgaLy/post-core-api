package kz.dar.academy.service;

import kz.dar.academy.model.PostModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class PostServiceImpl implements PostService{
    private static final HashMap<String, PostModel> postMap = new HashMap<>();

    static {
        PostModel PostModel1 = new PostModel(UUID.randomUUID().toString(), UUID.randomUUID().toString(),
                UUID.randomUUID().toString(), "Diploma", "In progress");
        PostModel PostModel2 = new PostModel(UUID.randomUUID().toString(), UUID.randomUUID().toString(),
                UUID.randomUUID().toString(), "Certificate", "In progress");
        PostModel PostModel3 = new PostModel(UUID.randomUUID().toString(), UUID.randomUUID().toString(),
                UUID.randomUUID().toString(), "Documents", "Completed");

        postMap.put(PostModel1.getPostId(), PostModel1);
        postMap.put(PostModel2.getPostId(), PostModel2);
        postMap.put(PostModel3.getPostId(), PostModel3);
    }

    @Override
    public void isWorkingCheck() {
    }

    @Override
    public void createPost(PostModel postModel) {
        postModel.setPostId(UUID.randomUUID().toString());
        postMap.put(postModel.getPostId(), postModel);
    }

    @Override
    public List<PostModel> getAllPosts() {
        return new ArrayList<>(postMap.values());
    }

    @Override
    public PostModel getPostById(String postId) {
        return postMap.get(postId);
    }

    @Override
    public void updatePostById(String postId, PostModel postModel) {
        postModel.setPostId(postId);
        postMap.put(postId, postModel);
    }

    @Override
    public void deletePostById(String postId) {
        postMap.remove(postId);
    }
}
