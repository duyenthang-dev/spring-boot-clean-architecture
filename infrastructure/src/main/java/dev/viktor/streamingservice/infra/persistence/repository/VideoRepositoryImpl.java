package dev.viktor.streamingservice.infra.persistence.repository;

import dev.viktor.streamingservice.application.port.output.VideoRepository;
import dev.viktor.streamingservice.domain.entity.Video;
import dev.viktor.streamingservice.infra.persistence.jpa.JpaVideoRepository;
import dev.viktor.streamingservice.infra.persistence.mapper.VideoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class VideoRepositoryImpl implements VideoRepository {
    private final JpaVideoRepository jpaVideoRepository;
    private final VideoMapper videoMapper;
    @Override
    public void saveVideo(Video video) {
        jpaVideoRepository.save(videoMapper.toEntity(video));
    }
}
