package com.pc.controller;

import com.pc.entity.User;
import com.pc.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.*;
import java.util.List;

@Controller
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ModelAndView index()
    {
        ModelAndView view = new ModelAndView("index");
        List<User>  users=userService.getAllUsers();
        view.addObject("users",users);
        return view;
    }

    @GetMapping("/del")
    public String delUser(@RequestParam("id") long id)
    {
        int i =userService.delUser(id);
        if(i == 0)
            JOptionPane.showMessageDialog(null, "删除失败", "alert", JOptionPane.ERROR_MESSAGE);
        return "redirect:/user";
    }

    @GetMapping("/add")
    public String add()
    {
        return "addUser";
    }

    @PostMapping("/adduser")
    public String addUser(User user)
    {
        int i = userService.insertUser(user);
        if(i==0)
            JOptionPane.showMessageDialog(null, "添加失败", "alert", JOptionPane.ERROR_MESSAGE);
        return "redirect:/user";
    }


}
