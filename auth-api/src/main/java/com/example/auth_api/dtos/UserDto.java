package com.example.auth_api.dtos;

public record UserDto(
        String nome,
        String login,
        String senha) {
}
