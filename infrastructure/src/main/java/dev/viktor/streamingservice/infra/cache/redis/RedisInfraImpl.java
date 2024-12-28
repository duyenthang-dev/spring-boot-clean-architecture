package dev.viktor.streamingservice.infra.cache.redis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.Optional;

@Component
public class RedisInfraImpl implements RedisInfraService{

    @Resource
    private RedisTemplate<String, Object> redisTemplate;
    @Override
    public void setString(String key, String value) {
        if (!StringUtils.hasLength(key)) {
            return;
        }

        redisTemplate.opsForValue().set(key, value);
    }

    @Override
    public String getString(String key) {
        return Optional.ofNullable(redisTemplate.opsForValue().get(key)).map(String::valueOf).orElse(null);
    }

    @Override
    public void setObject(String key, Object value) {
        if (!StringUtils.hasLength(key)) {
            return;
        }
        try {
            redisTemplate.opsForValue().set(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public <T> T getObject(String key, Class<T> clazz) throws JsonProcessingException {
        var result = redisTemplate.opsForValue().get(key);
        if (result == null) {
            return null;
        }

        if (result instanceof Map) {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.convertValue(result, clazz);
        }

        if (result instanceof String) {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue((String) result, clazz);
        }
        return null;
    }
}
