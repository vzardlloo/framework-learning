package org.vzard.service;

import org.springframework.stereotype.Service;
import org.vzard.domain.User;

/**
 * Created by V-zar on 2017/8/25.
 */
@Service
public class UserService {

    public User creatUser(User user) {
        user = new User();
        return user;
    }

}
