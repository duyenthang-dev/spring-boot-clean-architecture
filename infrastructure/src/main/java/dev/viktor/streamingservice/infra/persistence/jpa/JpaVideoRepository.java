package dev.viktor.streamingservice.infra.persistence.jpa;

import dev.viktor.streamingservice.infra.persistence.model.VideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaVideoRepository extends JpaRepository<VideoEntity, UUID> {
}
