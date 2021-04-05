package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User getById(Long id){
        Optional<User> byId = userRepository.findById(id);
        return byId.orElseGet(byId::get);
    }

    public User save(User user){
        return userRepository.save(user);
    }

    public Boolean delete(User user){
        userRepository.delete(user);
        return Boolean.TRUE;
    }
}
