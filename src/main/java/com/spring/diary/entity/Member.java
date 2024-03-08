package com.spring.diary.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="member")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq; // 회원 일련번호

    @NotNull
    private String email; // 이메일

    @NotNull
    private String password; // 비밀번호

    @NotNull
    private String name; // 이름

    private String nickname; // 닉네임

    @Temporal(TemporalType.DATE)
    private Date regdate; // 가입일자

    private String introduce; // 소개

    @Column(name = "profile_img")
    private String profileImg; //  프로필 이미지
}
