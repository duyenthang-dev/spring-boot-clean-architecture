package dev.viktor.streamingservice.api.http.controller;

import dev.viktor.streamingservice.api.http.dto.request.CreateVideoRequest;
import dev.viktor.streamingservice.application.port.input.VideoUseCase;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/videos")
@RequiredArgsConstructor
public class VideoController {
    private final Logger logger = LoggerFactory.getLogger(VideoController.class);
    private final VideoUseCase videoUseCase;

    @PostMapping
    public ResponseEntity<?> createVideo(@RequestBody CreateVideoRequest request) {
        logger.info("Creating video: {}", request);
        videoUseCase.createVideo(request.toDomain());
        return ResponseEntity.ok("Video created");
    }
}
