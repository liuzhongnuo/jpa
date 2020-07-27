package com.offcn.jpa.controller;

import com.offcn.jpa.pojo.User;
import com.offcn.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String findAll(Model model){
        List<User> userList = userService.findAll();
        model.addAttribute("page",userList);
        return "user/list";
    }
    //用户点击add按钮，跳转到新增用户页面
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "user/userAdd";
    }
    //保存新增用户数据
    @PostMapping("/add")
    public String save(User user){
        userService.add(user);
        return "redirect:/user/";
    }
    //跳转到编辑页面
    @RequestMapping("toEdit/{id}")
    public String toEdit(Model model,@PathVariable("id") Long id){
        User user = userService.findOne(id);
        model.addAttribute("user",user);
        return "user/userEdit";
    }
    //保存修改用户数据
    @RequestMapping("/update")
    public String update(User user){
        userService.update(user.getId(),user);
        //跳转到列表页面
        return "redirect:/user/";
    }
    //删除用户数据
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        userService.delete(id);
        return "redirect:/user/";
    }
}
