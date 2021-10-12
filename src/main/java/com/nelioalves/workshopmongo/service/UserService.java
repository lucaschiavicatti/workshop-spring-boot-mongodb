package com.nelioalves.workshopmongo.service;

import com.nelioalves.workshopmongo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nelioalves.workshopmongo.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return  repo.findAll();
    }
}
