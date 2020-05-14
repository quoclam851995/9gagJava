package com.morsoftware.converter;

import com.morsoftware.dto.PostDTO;
import com.morsoftware.entity.PostEntity;
import org.springframework.stereotype.Component;

@Component
public class PostConverter {
    public PostEntity toEntity(PostDTO postDTO) {
        PostEntity entity = new PostEntity();
        entity.setTitle(postDTO.getTitle());
        entity.setContent(postDTO.getContent());
        entity.setDescription(postDTO.getDescription());
        entity.setThumbnail(postDTO.getThumbnail());
        return entity;
    }
    public PostDTO toDTO(PostEntity postEntity) {
        PostDTO dto = new PostDTO();
        dto.setTitle(postEntity.getTitle());
        dto.setContent(postEntity.getContent());
        dto.setDescription(postEntity.getDescription());
        dto.setThumbnail(postEntity.getThumbnail());
        return dto;
    }
}
