package kz.dar.academy.controller;

import kz.dar.academy.model.PostModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @GetMapping("/check")
    public ResponseEntity<String> isWorkingCheck() {
        return null;
    }

    @PostMapping
    public ResponseEntity<String> createPost(@Valid @RequestBody PostModel postModel) {
        return null;
    }

    @GetMapping("/all")
    public List<PostModel> getAllPosts() {
        return null;
    }

    @GetMapping("/{postId}")
    public PostModel getPostById(@PathVariable String postId) {
        return null;
    }

    @PutMapping("/{postId}")
    public ResponseEntity<String> updatePostById(@PathVariable String postId,
                                                     @Valid @RequestBody PostModel postModel) {
        return null;
    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<String> deletePostById(@PathVariable String postId) {
        return null;
    }
}
