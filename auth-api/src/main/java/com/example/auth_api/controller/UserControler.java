package com.example.auth_api.controller;

import com.example.auth_api.dtos.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UserControler {

    @PostMapping
    private ResponseEntity<UserDto> salvar(@RequestBody UserDto userDto ){
        return ResponseEntity.ok(userDto);

    }

}
