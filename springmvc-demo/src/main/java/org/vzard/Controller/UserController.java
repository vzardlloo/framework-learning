package org.vzard.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.vzard.domain.User;
import org.vzard.service.UserService;


/**
 *
 *
 * Created by V-zar on 2017/8/25.
 */
@Controller

public class UserController {
    // @Autowired(required = false)
    //UserService userService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/adduser")
    public String addUser() {
        return "adduser";
    }


    @RequestMapping(value = "/success")
    public ModelAndView register(User user) {
        //userService.creatUser(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("success");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

}
