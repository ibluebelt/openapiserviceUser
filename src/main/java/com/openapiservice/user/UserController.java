package com.openapiservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{userId}")
    public User getUser(User pUser) {
        return userService.getUser(pUser);
    }

    @PostMapping("/users")
    public User addUser(User pUser) {
        userService.addUser(pUser);
        return pUser;
    }

    @PutMapping("/users/{userId}")
    public String modifyUser(@RequestBody String jsonStr, User pUser) {
        log.debug(jsonStr);
        userService.modifyUser(pUser);
        return jsonStr;
    }

    @DeleteMapping("/users/{userId}")
    public User removeUser(User pUser) {
        userService.removeUser(pUser);
        return pUser;
    }
}
