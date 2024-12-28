package dev.viktor.streamingservice.api.http.dto.request;

import dev.viktor.streamingservice.domain.entity.Video;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateVideoRequest {
    private String title;
    private String description;
    private String url;
    private String contentType;
    private String materialId;

    public Video toDomain() {
        Video video = new Video();
        video.setTitle(title);
        video.setDescription(description);
        video.setUrl(url);
        video.setContentType(contentType);
        video.setMaterialId(materialId);
        return video;
    }
}
