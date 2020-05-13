package com.morsoftware.api;

import com.morsoftware.dto.PostDTO;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewApi {
    @PostMapping
    public PostDTO createPost(@RequestBody PostDTO model) {
        return model;
    }

    @DeleteMapping
    public void deletePost(@RequestBody long[] ids) {

    }
}
