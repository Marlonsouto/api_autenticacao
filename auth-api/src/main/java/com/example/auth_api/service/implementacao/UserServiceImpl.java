package com.example.auth_api.service.implementacao;

import com.example.auth_api.dtos.UserDto;
import com.example.auth_api.model.User;
import com.example.auth_api.repository.UserRepository;
import com.example.auth_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto salvar(UserDto userDto) {
        usuarioIsPresent(userDto);
        User userEntity = new User(userDto.nome(), userDto.login(), userDto.senha());
        User novoUsuario = userRepository.save(userEntity);
        return new UserDto(novoUsuario.getNome(), novoUsuario.getLogin(), novoUsuario.getSenha());
    }

    private void usuarioIsPresent(UserDto userDto) {
        Optional <User> user = Optional.ofNullable(userRepository.findByLogin(userDto.login()));
        if (user.isPresent()) {
            throw new RuntimeException("Usuario ja existe");
        }
    }
}
