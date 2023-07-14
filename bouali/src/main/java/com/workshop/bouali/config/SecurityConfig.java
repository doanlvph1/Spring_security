package com.workshop.bouali.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import java.util.ArrayList;


@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
        http.formLogin();
        http.httpBasic();
        return http.build();
    }

}
