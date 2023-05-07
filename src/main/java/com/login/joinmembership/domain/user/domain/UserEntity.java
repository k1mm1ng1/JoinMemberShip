package com.login.joinmembership.domain.user.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // Entitiy
@Getter // 전역 변수들을 외부클래스를 가져올 수 있게 도와주는 친구
@Builder
@AllArgsConstructor //생성자 도와주는 친구
@NoArgsConstructor // 생성자 도와주는 친구
public class UserEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 1씩 추가해주는 친구
    private Long UserId;

    private String pw;

    private String id;
}
