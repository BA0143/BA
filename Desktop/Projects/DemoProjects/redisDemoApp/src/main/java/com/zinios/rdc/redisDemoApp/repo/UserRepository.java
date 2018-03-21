package com.zinios.rdc.redisDemoApp.repo;

import com.zinios.rdc.redisDemoApp.model.User;

import java.util.Map;

public interface UserRepository {
    void save(final User user);
    Object getUserById(final String userId);
    Map<Object,Object> findAllUser();
    

}
