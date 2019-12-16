package com.madao.icouncil.controller;

import com.madao.icouncil.model.User;
import com.madao.icouncil.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
public class UserController {


    @Resource
    private IUserService userService;


    @Resource
    private RestTemplate restTemplate;



    @GetMapping("/user/login")
    public ResponseEntity<User> login(){

        return ResponseEntity.ok(userService.getById(1l));
    }
}
