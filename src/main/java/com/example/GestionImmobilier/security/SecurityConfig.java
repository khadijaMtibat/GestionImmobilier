package com.example.GestionImmobilier.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Autowired
    PasswordEncoder passwordEncoder;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.formLogin();

        httpSecurity.authorizeHttpRequests().requestMatchers("/createPropriete").hasAnyRole("ADMIN");
        httpSecurity.authorizeHttpRequests().requestMatchers("/savePropriete").hasAnyRole("ADMIN");
        httpSecurity.authorizeHttpRequests().requestMatchers("/showProduct").hasAnyRole("ADMIN");
        httpSecurity.authorizeHttpRequests().requestMatchers("/deletePropriete").hasAnyRole("ADMIN");
        httpSecurity.authorizeHttpRequests().requestMatchers("/updatePropriete").hasAnyRole("ADMIN");
        httpSecurity.authorizeHttpRequests().requestMatchers("/proprietelist").hasAnyRole("ADMIN","USER");


/*
        httpSecurity.authorizeHttpRequests().requestMatchers("/createPropriete","/savePropriete","/showProduct","/deletePropriete","/updatePropriete").hasAnyRole("ADMIN");
        httpSecurity.authorizeHttpRequests().requestMatchers("/proprietelist").hasAnyRole("ADMIN","USER");

 */


        httpSecurity.authorizeHttpRequests().anyRequest().authenticated();
        return httpSecurity.build();

    }


   @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        return new InMemoryUserDetailsManager(
                User.withUsername("admin").password(passwordEncoder.encode("123")).roles("ADMIN","USER").build(),
                User.withUsername("client").password(passwordEncoder.encode("123")).roles("USER").build()
        );
    }

    //@Bean
   /* public JdbcUserDetailsManager jdbcUserDetailsManager(DataSource dataSource){
        return new JdbcUserDetailsManager(dataSource);
    }
    */



}
