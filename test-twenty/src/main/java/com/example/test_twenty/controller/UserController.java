package com.example.test_twenty.controller;

import com.example.test_twenty.dto.LoginDTO;
import com.example.test_twenty.entity.User;
import com.example.test_twenty.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping(path = "users")
    public List<User> getAllUsers(){  //get all the users as a list
        return userService.getAllUsers();
    }
    @PostMapping(path = "users")
    public User createUser(@RequestBody User user){ //send the user details inside the http request body
        return userService.createUser(user);
    }
    @GetMapping(path = "users/{id}")
    public User getUserById(@PathVariable int id){ //send the id parameter as a path variable
        return userService.getUserById(id);
    }
    @DeleteMapping(path = "users/{id}")
    public void deleteUserById(@PathVariable int id){ //send the id parameter as a path variable
        userService.deleteUserById(id);
    }

    @PutMapping(path = "users/{id}") //send id parameter as a path variable
    public User updateUser(@PathVariable int id, @RequestBody User user){ //send the user info inside the request body
        return userService.updateUser(id, user);
    }

    //------Query based REST END points for searching and filtering
    @GetMapping(path = "users" ,params = {"name", "email"})
    //send user's name, email as request parameter
    public List<User> searchUserByNameEmail(@RequestParam String name, @RequestParam String email){
        return userService.searchUserByNameEmail(name , email);
    }

    @GetMapping(path = "users" , params = "name")
    //send user's name as request parameter
    public List<User> searchUserByName(@RequestParam String name){
        return userService.searchUserByName(name);
    }

    @GetMapping(path = "users", params = "email")
    //send user's email as request parameter
    public List<User> searchUserByEmail(@RequestParam String email){
        return userService.searchUserByEmail(email);
    }

    //---------Action based designed REST-end point for non-crud operation-------//
    // POST method for user login validation
    @PostMapping("users/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO) {
        boolean isValid = userService.validateUser(loginDTO);

        if (isValid) {
            return ResponseEntity.ok().body(Map.of("message", "Login successful"));
        } else {
            return ResponseEntity.status(401).body(Map.of("message", "Invalid email or password"));
        }
    }





}
