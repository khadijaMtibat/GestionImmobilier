package com.example.GestionImmobilier;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@SpringBootApplication
public class GestionImmobilierApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionImmobilierApplication.class, args);
	}
	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	/*

	//@Bean
	CommandLineRunner commandLineRunner(JdbcUserDetailsManager jdbcUserDetailsManager){
		PasswordEncoder passwordEncoder=passwordEncoder();
		return args -> {
			jdbcUserDetailsManager.createUser(User.withUsername("admin").password(passwordEncoder.encode("123")));
			jdbcUserDetailsManager.createUser(User.withUsername("client").password(passwordEncoder.encode("123"));
		};
	}

	 */

}
