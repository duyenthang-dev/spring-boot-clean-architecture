package dev.viktor.streamingservice.infra.persistence.mapper;

import dev.viktor.streamingservice.domain.entity.Video;
import dev.viktor.streamingservice.infra.persistence.model.VideoEntity;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.UUID;

@Component
public class VideoMapper {
    public VideoEntity toEntity(Video video) {
        var entity = new VideoEntity();
        if (video.getId() != null) {
            entity.setId(UUID.fromString(video.getId()));
        }
        
        entity.setTitle(video.getTitle());
        entity.setDescription(video.getDescription());
        entity.setUrl(video.getUrl());
        entity.setContentType(video.getContentType());
        entity.setMaterialId(video.getMaterialId());
        entity.setCreatedAt(Instant.now());
        return entity;
    }
}
