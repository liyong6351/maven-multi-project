package com.yidu.web.controller;


import com.yidu.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/6/13.
 */
@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "home",method= RequestMethod.GET)
    public @ResponseBody String home(Model model){
        model.addAttribute("users", "hello");
        String result = "is null";
        if(userService != null){
            result = "is not null";
        }
        return result;
    }
}
