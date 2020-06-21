package com.itsz.spring.boot.exception.handler.user.controller;

import com.itsz.spring.boot.exception.handler.exception.ResponseEnum;
import com.itsz.spring.boot.exception.handler.user.domain.User;
import com.itsz.spring.boot.exception.handler.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<List<User>> queryAll() {
        return new ResponseEntity<>(userService.selectAll(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<User> queryById(@PathVariable(name = "id") long id) throws Exception {
        User user = userService.selectByPrimaryKey(id);
        ResponseEnum.BAD_LICENCE_TYPE.assertNotNull(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
