package com.zyc.sss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author zhangyongchao
 * @date 2020/5/13 22:20
 * @description
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, String username, String password, ModelAndView modelAndView, RedirectAttributes redirectAttributes){
        HttpSession session = request.getSession();
        if ("admin".equals(username) && "admin".equals(password)){
            // 登录成功
            session.setAttribute("SESSION_USER", username);
            return "redirect:list";
        }

        // 登录失败
        redirectAttributes.addFlashAttribute("tips", "用户名或密码不正确，请重新输入后登录!");
        return  "redirect:login";

    }

}
