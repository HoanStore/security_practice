package com.mqnic.hoan_security_ch01_ex00.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private String idPwdNotMatch = "입력하신 정보를 다시 한 번 확인해주세요.";

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = String.valueOf(authentication.getCredentials());

        try {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);
            // 사용자 이름은 있지만 비밀번호가 틀린 경우 처리
            if (userDetails.getPassword().equals(password)) {
                return new UsernamePasswordAuthenticationToken(username, password, userDetails.getAuthorities());
            } else {
                throw new AuthenticationCredentialsNotFoundException(idPwdNotMatch);
            }
        } catch (UsernameNotFoundException e) {
            // 사용자 이름이 존재하지 않는 경우의 처리
            throw new AuthenticationCredentialsNotFoundException(idPwdNotMatch);
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
