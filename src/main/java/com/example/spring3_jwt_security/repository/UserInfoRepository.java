package com.example.spring3_jwt_security.repository;


import com.example.spring3_jwt_security.entity.UserInfo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

    Optional<UserInfo> findByName(String username);
}
