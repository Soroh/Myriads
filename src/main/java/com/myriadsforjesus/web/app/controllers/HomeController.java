package com.myriadsforjesus.web.app.controllers;

import com.myriadsforjesus.web.app.models.Myriad;
import com.myriadsforjesus.web.app.models.Post;
import com.myriadsforjesus.web.app.models.User;
import com.myriadsforjesus.web.app.service.MyriadService;
import com.myriadsforjesus.web.app.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class HomeController {
    @Autowired
    private MyriadService myriadService;
    @Autowired
    private PostService postService;


    @RequestMapping("/")//home page
    public String homePage(Model model){

        model.addAttribute("user", new User());
        return "home/index";
    }


    @RequestMapping(path="/user/login", method = {RequestMethod.POST})//when user logs in
    public ModelAndView newsFeed(@ModelAttribute User user){
        System.out.print(user.getEmail());
        ModelAndView modelAndView = new ModelAndView();
        Myriad myriad = myriadService.findByEmail(user.getEmail());
        List<Post> posts = postService.getAllPosts();
        modelAndView.addObject("posts",posts);
        modelAndView.addObject("myriad",myriad);
        modelAndView.setViewName("newsfeed/newsfeed");

        return modelAndView;
    }

}
