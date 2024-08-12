package com.example.auth_api.dtos;

public record UserDto(
        String nome,
        String login,
        String senha) {

    public UserDto(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }
}
