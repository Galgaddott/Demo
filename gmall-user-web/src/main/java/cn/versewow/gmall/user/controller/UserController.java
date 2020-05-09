package cn.versewow.gmall.user.controller;


import cn.versewow.gmall.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Reference
    UserService userService;

    @RequestMapping("test")
    @ResponseBody
    public String test(){

    return userService.test();
    }

}
