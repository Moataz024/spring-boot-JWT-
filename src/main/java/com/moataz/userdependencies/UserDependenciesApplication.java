package com.moataz.userdependencies;


import com.moataz.userdependencies.entities.Role;
import com.moataz.userdependencies.entities.User;
import com.moataz.userdependencies.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class UserDependenciesApplication {

    @Autowired
    UserServiceImpl userService;

//    @PostConstruct
//    void init_users() {
//
////ajouter les rôles
//        userService.addRole(new Role(null,"ADMIN"));
//        userService.addRole(new Role(null,"USER"));
////ajouter les users
//        userService.saveUser(new User(null,"admin","123",true,null));
//        userService.saveUser(new User(null,"nadhem","123",true,null));
//        userService.saveUser(new User(null,"yassine","123",true,null));
////ajouter les rôles aux users
//        userService.addRoleToUser("admin", "ADMIN");
//        userService.addRoleToUser("admin", "USER");
//        userService.addRoleToUser("nadhem", "USER");
//        userService.addRoleToUser("yassine", "USER");
//    }
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public static void main(String[] args) {
        SpringApplication.run(UserDependenciesApplication.class, args);
    }

}
