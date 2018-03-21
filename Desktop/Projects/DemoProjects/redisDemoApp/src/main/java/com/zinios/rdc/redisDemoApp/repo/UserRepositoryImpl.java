package com.zinios.rdc.redisDemoApp.repo;

import com.zinios.rdc.redisDemoApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    public RedisTemplate redisTemplate;

    public static final String KEY="User";
    
    @Override
    public void save(User user) {
        redisTemplate.opsForHash().put(KEY,user.getUserId(),user);
    }

    @Override
    public Object getUserById(String userId) {
        return redisTemplate.opsForHash().get(KEY,userId);
    }

    @Override
    public Map<Object, Object> findAllUser() {

        return redisTemplate.opsForHash().entries(KEY);
    }


}
