package dev.viktor.streamingservice.application.usecase;

import dev.viktor.streamingservice.application.port.input.VideoUseCase;
import dev.viktor.streamingservice.application.port.output.VideoRepository;
import dev.viktor.streamingservice.domain.entity.Video;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VideoUseCaseImpl implements VideoUseCase {
    private final VideoRepository videoRepository;

    @Override
    public void createVideo(Video video) {
        videoRepository.saveVideo(video);
    }
}
