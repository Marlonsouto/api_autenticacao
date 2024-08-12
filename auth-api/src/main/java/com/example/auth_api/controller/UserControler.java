package com.example.auth_api.controller;

import com.example.auth_api.dtos.UserDto;
import com.example.auth_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UserControler {

    @Autowired
    private UserService userService;

    @PostMapping
    private ResponseEntity<UserDto> salvar(@RequestBody UserDto userDto ){
        return ResponseEntity.ok().body(userService.salvar(userDto));
    }

}
