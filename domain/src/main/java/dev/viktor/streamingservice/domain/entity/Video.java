package dev.viktor.streamingservice.domain.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Video {
    private String id;
    private String title;
    private String description;
    private String url;
    private String contentType;
    private String materialId;
}
