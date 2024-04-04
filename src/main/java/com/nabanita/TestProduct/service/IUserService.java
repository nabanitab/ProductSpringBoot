package com.nabanita.TestProduct.service;

import com.nabanita.TestProduct.model.UserModel;

public interface IUserService {

    public Long saveProduct(UserModel userModel);

    public boolean isUserExists(Long id);
}
