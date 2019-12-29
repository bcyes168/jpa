package nnbc.tech.jpa.controller;

import nnbc.tech.jpa.entity.User;
import nnbc.tech.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;


    @GetMapping(value = "/userList")

    public List<User> userList(){
        List userList = userRepository.findAll();
        return userList;
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable("id")Integer id){
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    @PostMapping("/user")
    public User insertUser(User user){
        user.setBirthday(new Date());
        user.setCreatdTime(new Date());
        User save = userRepository.save(user);
        return save;
    }

    @PatchMapping("/patch")
    public User patchtUser(User user){
        user.setBirthday(new Date());
        user.setCreatdTime(new Date());
        User save = userRepository.save(user);
        return save;
    }

    @PutMapping("/put")
    public User putUser(User user){
        user.setBirthday(new Date());
        user.setCreatdTime(new Date());
        User save = userRepository.save(user);
        return save;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id")Integer id){
        userRepository.deleteById(id);
        return "已经删除"+id;
    }

}
