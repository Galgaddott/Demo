package cn.versewow.gmall.gmalluser.user.controller;


import cn.versewow.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("test")
    @ResponseBody
    public String test(){

    return "hello";
    }

}
