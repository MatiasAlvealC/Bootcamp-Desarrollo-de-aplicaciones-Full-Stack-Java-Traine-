package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.models.Users;
import com.example.demo.repositories.RoleRepository;
import com.example.demo.repositories.UserRepository;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    
    public UserService(UserRepository userRepository, RoleRepository
    roleRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
    this.userRepository = userRepository;
    this.roleRepository = roleRepository;
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
    public void saveWithUserRole(Users user) {
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    user.setRoles(roleRepository.findByName("ROLE_USER"));
    userRepository.save(user);
    }
    public void saveUserWithAdminRole(Users user) {
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
    userRepository.save(user);
    }
    public Users findByUsername(String username) {
    return userRepository.findByUsername(username);
    }

}

