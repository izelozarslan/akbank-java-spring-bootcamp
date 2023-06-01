package com.izelozarslan.homework2.service;

import com.izelozarslan.homework2.entity.User;
import com.izelozarslan.homework2.general.BaseEntityService;
import com.izelozarslan.homework2.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseEntityService<User, UserRepository> {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public User findByUsername(String username){
        return repository.findByUsername(username);
    }

    public boolean existByUsername(String username){
        return repository.existsByUsername(username);
    }

    public boolean existByEmail(String email){
        return repository.existsByEmail(email);
    }

    public User findUserByUsername(String username){
        return repository.findUserByUsername(username);
    }


}
