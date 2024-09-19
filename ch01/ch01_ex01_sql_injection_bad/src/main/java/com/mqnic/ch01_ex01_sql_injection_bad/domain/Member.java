package com.mqnic.ch01_ex01_sql_injection_bad.domain;


import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Member {

    private Long id;
    private String username;
    private String password;
    private String email;

}
