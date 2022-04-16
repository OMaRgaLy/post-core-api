package kz.dar.academy.controller;

import kz.dar.academy.model.PostRequest;
import kz.dar.academy.model.PostResponse;
import kz.dar.academy.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    Environment env;

    @GetMapping("/check")
    public ResponseEntity<String> isWorkingCheck() {
        postService.isWorkingCheck();
        return new ResponseEntity<String>("post-core-api is working at the port " + env.getProperty("local.server.port"), HttpStatus.OK);
    }

    @PostMapping
    public PostResponse createPost(@Valid @RequestBody PostRequest postRequest) {
        return postService.createPost(postRequest);
    }

    @PutMapping
    public PostResponse updatePost(@Valid @RequestParam PostRequest postRequest) {
        return postService.updatePost(postRequest);
    }

    @GetMapping("/all")
    public List<PostResponse> getAllPosts() {
        return postService.getAllPosts();
    }

    @GetMapping
    public PostResponse getPostById(@RequestParam String postId) {
        return postService.getPostById(postId);
    }

    @DeleteMapping
    public void deletePostById(@RequestParam String postId) {
        postService.deletePostById(postId);
    }
}
