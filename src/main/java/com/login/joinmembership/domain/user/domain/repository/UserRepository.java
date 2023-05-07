package com.login.joinmembership.domain.user.domain.repository;

import com.login.joinmembership.domain.user.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //명시적으로 표기해주기
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findById(String id);
}
