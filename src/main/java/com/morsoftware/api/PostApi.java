package com.morsoftware.api;

import com.morsoftware.dto.PostDTO;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostApi {
    @PostMapping
    public PostDTO createPost(@RequestBody PostDTO model) {
        return model;
    }

    @PutMapping

    public PostDTO updatePost(@RequestBody PostDTO model) {
        return model;
    }

    @DeleteMapping
    public void deletePost(@RequestBody long[] ids) {

    }

}
