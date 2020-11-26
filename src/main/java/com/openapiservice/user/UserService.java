package com.openapiservice.user;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

    public User getUser(User pUser) {
        log.debug("getUser");
        return null;
    }

    public void addUser(User pUser) {
        log.debug("addUser");
    }

    public void modifyUser(User pUser) {
        log.debug("modifyUser");
    }

    public void removeUser(User pUser) {
        log.debug("removeUser");
    }

}
