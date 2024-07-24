package com.example.demo.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Users;
import com.example.demo.repositories.UserRepository;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<Users> obtenerTodosLosUsuarios() {
        return userRepository.findAll();
    }

    public Users obtenerUsuarioPorId(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public Users guardarUsuario(Users user) {
        return userRepository.save(user);
    }

    public void eliminarUsuario(Long id) {
        userRepository.deleteById(id);
    }
    
    public Users buscarUsuarioPorNombre(String nombre) {
        return userRepository.findByName(nombre);
    }
}
