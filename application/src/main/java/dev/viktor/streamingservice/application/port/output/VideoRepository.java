package dev.viktor.streamingservice.application.port.output;

import dev.viktor.streamingservice.domain.entity.Video;

public interface VideoRepository {
    void saveVideo(Video video);
}
