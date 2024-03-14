package com.johnson.johnsonMFB.service;

import com.johnson.johnsonMFB.entity.Users;
import com.johnson.johnsonMFB.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;
    // CRUD methods
    public Users create(Users user){
        return usersRepository.save(user);
    }
    public Optional<Users> readOne(Long id){
        return usersRepository.findById(id);
    }
    public List<Users> readAll(){
        return usersRepository.findAll();
    }
    public Users update(Long id, Users updater){
        updater.setId(id);
        return usersRepository.save(updater);
    }
    public void delete(Long id){
        usersRepository.deleteById(id);
    }
}
