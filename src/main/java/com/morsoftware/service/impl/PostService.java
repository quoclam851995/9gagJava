package com.morsoftware.service.impl;

import com.morsoftware.converter.PostConverter;
import com.morsoftware.dto.PostDTO;
import com.morsoftware.entity.CategoryEntity;
import com.morsoftware.entity.PostEntity;
import com.morsoftware.repository.CategoryRepository;
import com.morsoftware.repository.PostRepository;
import com.morsoftware.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService implements IPostService {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private PostConverter postConverter;

    @Override
    public PostDTO save(PostDTO postDTO) {
        CategoryEntity categoryEntity = categoryRepository.findOneByCode(postDTO.getCategoryCode());
        PostEntity postEntity = postConverter.toEntity(postDTO);
        postEntity.setCategory(categoryEntity);
        postEntity = postRepository.save(postEntity);

        return postConverter.toDTO(postEntity);
    }
}
