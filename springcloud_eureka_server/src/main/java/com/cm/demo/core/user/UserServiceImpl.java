package com.cm.demo.core.user;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void getUser() {
        System.out.println("输出");
        System.out.println("ssss");
    }
}
