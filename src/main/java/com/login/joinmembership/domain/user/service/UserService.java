package com.login.joinmembership.domain.user.service;

import com.login.joinmembership.domain.user.domain.UserEntity;
import com.login.joinmembership.domain.user.domain.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public String join(String id, String pw) {


        Optional<UserEntity> user = userRepository.findById(id);

        if(user.isPresent()){
            return "중복된 아이디 입니다.";
        }

        UserEntity save = userRepository.save(UserEntity.builder()
                .id(id)
                .pw(pw)
                .build()
        );

        return save.getId();
    }
}
