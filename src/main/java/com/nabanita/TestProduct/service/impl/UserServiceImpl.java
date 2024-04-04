package com.nabanita.TestProduct.service.impl;

import com.nabanita.TestProduct.model.UserModel;
import com.nabanita.TestProduct.repo.UserRepository;
import com.nabanita.TestProduct.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Long saveProduct(UserModel userModel) {
        return userRepository.save(userModel).getId();
    }

    @Override
    public boolean isUserExists(Long id) {
        return userRepository.existsById(id);
    }
}
