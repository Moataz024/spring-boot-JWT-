package com.moataz.userdependencies.restControllers;


import com.moataz.userdependencies.entities.User;
import com.moataz.userdependencies.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserRESTController {

    @Autowired
    UserService userService;


    @RequestMapping(path = "all",method = RequestMethod.GET)
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

}
