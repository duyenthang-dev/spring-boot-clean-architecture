package dev.viktor.streamingservice.application.port.input;

import dev.viktor.streamingservice.domain.entity.Video;

public interface VideoUseCase {
    void createVideo(Video video);
}
