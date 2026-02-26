package dev.folomkin.userservice.service;

import dev.folomkin.userservice.entity.User;
import dev.folomkin.userservice.entity.UserDto;
import dev.folomkin.userservice.entity.UserMapper;
import dev.folomkin.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User create(UserDto dto){
        return repository.save(UserMapper.dtoToEntity(dto));
    }

    public List<User> allUsers(){
        return repository.findAll();
    }
}
