package com.velocity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

/**
 * @description: 测试velocity控制器
 * @author: jiangxy
 * @create: 2019-02-12 10:40
 */
@Controller
@RequestMapping("/first/velocityTest")
public class FirstController {

    @RequestMapping({"/myVelocity" })
    public ModelAndView test(HttpServletRequest request) {
        ModelAndView model = new ModelAndView("first_velocity");
        model.addObject("key", "我来了，velocity！");
        return model;
    }

}
