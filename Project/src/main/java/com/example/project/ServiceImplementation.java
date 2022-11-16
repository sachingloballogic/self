package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplementation {

    @Autowired
    private Repository repository;

    public Clone create(Clone clone){
        Username username = Username.builder()
                .name(clone.getName())
                .mobile(clone.getMobile())
                .username(clone.getUsername())
                .build();
        this.repository.save(username);
        Clone clone1 = Clone.builder()
                .name(username.getName())
                .username(username.getUsername())
                .mobile(username.getMobile())
                .build();
        return clone1;
    }
}
