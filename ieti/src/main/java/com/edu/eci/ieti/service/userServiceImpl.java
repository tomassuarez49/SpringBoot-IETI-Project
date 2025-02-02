package com.edu.eci.ieti.service;

import com.edu.eci.ieti.repository.user;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class userServiceImpl implements userService {

    private final Map<String, user> usersDatabase = new HashMap<>();

    @Override
    public user save(user user) {
        usersDatabase.put(user.getId(), user);
        return user;
    }

    @Override
    public List<user> all() {
        return new ArrayList<>(usersDatabase.values());
    }

    @Override
    public Optional<user> findById(String id) {
        return Optional.ofNullable(usersDatabase.get(id));
    }

    @Override
    public void deleteById(String id) {
        usersDatabase.remove(id);
    }

    @Override
    public user update(String id, user user) {
        usersDatabase.put(id, user);
        return user;
    }
}
