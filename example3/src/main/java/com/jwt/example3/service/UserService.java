package com.jwt.example3.service;

import com.jwt.example3.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store=new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Albin S","as@g.com"));
        store.add(new User(UUID.randomUUID().toString(), "Zalbin S","zs@g.com"));
        store.add(new User(UUID.randomUUID().toString(), "Calbin S","cs@g.com"));
        store.add(new User(UUID.randomUUID().toString(), "Balbin S","bs@g.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
