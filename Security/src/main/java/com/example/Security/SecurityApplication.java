package com.example.Security;

import com.example.Security.entity.Role;
import com.example.Security.entity.User;
import com.example.Security.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;

@SpringBootApplication
@EnableWebSecurity
@EnableJpaRepositories
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Bean
	BCryptPasswordEncoder brBCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}

//	@Bean
//	CommandLineRunner run(UserService userService){
//		return args -> {
//			userService.saveRole(new Role(null, "ROLE_USER"));
//			userService.saveRole(new Role(null, "ROLE_MANAGER"));
//			userService.saveRole(new Role(null, "ROLE_ADMIN"));
//			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//
//			userService.saveUser(new User(null, "VAN A","A","A@gmail.com","123456", new HashSet<>()));
//			userService.saveUser(new User(null, "VAN B","B","B@gmail.com","123456", new HashSet<>()));
//
//			userService.adToUser("A@gmail.com","ROLE_USER");
//			userService.adToUser("A@gmail.com","ROLE_MANAGER");
//			userService.adToUser("B@gmail.com","ROLE_ADMIN");
//			userService.adToUser("B@gmail.com","ROLE_SUPER_ADMIN");
//
//		};
//	}
}

