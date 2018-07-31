package com.example.chaorenjob.dao;

import com.example.chaorenjob.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    UserEntity findByUserNameAndPassword(String userName, String password);
}
