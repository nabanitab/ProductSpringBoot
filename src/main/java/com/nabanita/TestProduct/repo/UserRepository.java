package com.nabanita.TestProduct.repo;

import com.nabanita.TestProduct.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Long> {
}
