package com.soap.bootcamp2.service;

import com.soap.bootcamp2.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void inizialize() {
        User peter = new User();
        peter.setName("Peter");
        peter.setEmpId(1);
        peter.setSalary(1000);

        User lucas = new User();
        lucas.setName("Lucas");
        lucas.setEmpId(2);
        lucas.setSalary(1500);

        User maria = new User();
        maria.setName("Maria");
        maria.setEmpId(3);
        maria.setSalary(1800);

        users.put(peter.getName(), peter);
        users.put(lucas.getName(), lucas);
        users.put(maria.getName(), maria);
    }

    public User getUsers(String name) {
        System.out.println(name);
        return users.get(name);
    }
}
