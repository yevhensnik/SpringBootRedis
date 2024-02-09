package com.test.redis.springbootredis.controller;

import com.test.redis.springbootredis.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @PostMapping("/send")
    public void sendMessage(@RequestBody Message message) {
        redisTemplate.opsForValue().set(message.getKey(), message.getContent());
    }

    @GetMapping("/get/{id}")
    public String getMessage(@PathVariable String id) {
        return redisTemplate.opsForValue().get(id);
    }
}
