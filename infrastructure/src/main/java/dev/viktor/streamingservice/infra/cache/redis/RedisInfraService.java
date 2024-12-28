package dev.viktor.streamingservice.infra.cache.redis;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface RedisInfraService {
    void setString(String key, String value);
    String getString(String key);

    void setObject(String key, Object value);
    <T> T getObject(String key, Class<T> clazz) throws JsonProcessingException;
}
