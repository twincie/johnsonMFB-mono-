package com.johnson.johnsonMFB.controller;

import com.johnson.johnsonMFB.entity.Users;
import com.johnson.johnsonMFB.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping
    public Users createUser(@RequestBody Users users){
        return usersService.create(users);
    }
    @GetMapping("/{id}")
    public Optional<Users> readOneUser(@PathVariable Long id){
        return usersService.readOne(id);
    }
    @GetMapping
    public List<Users> readAllUsers(){
        return usersService.readAll();
    }
    @PutMapping("/{id}")
    public Users updateUser(@PathVariable Long id, @RequestBody Users users){
        return usersService.update(id, users);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        usersService.delete(id);
    }
}
