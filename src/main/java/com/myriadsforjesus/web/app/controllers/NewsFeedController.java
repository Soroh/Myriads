package com.myriadsforjesus.web.app.controllers;

import com.myriadsforjesus.web.app.models.Post;
import com.myriadsforjesus.web.app.service.MyriadService;
import com.myriadsforjesus.web.app.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class NewsFeedController {

    @Autowired
    private PostService postService;
    @Autowired
    private MyriadService myriadService;


    @RequestMapping("/newsfeed/newsfeed")
    public @ResponseBody String  newsFeed(@RequestParam String message, @RequestParam Long myriadId){
        Post post = new Post(myriadService.findById(myriadId),LocalDateTime.now(),message,"0" );
        postService.savePost(post);





//        ModelAndView model = new ModelAndView();
//        List<Post> posts = postService.getAllPosts();
//        model.addObject("posts",posts);
//        model.setViewName("newsfeed/newsfeed");
//        posts.stream().forEach(x->{
//            System.out.println(x);
//        });
        return "newsfeed/newsfeed";
    }

//    @RequestMapping("/newsfeed/newsfeed")
//    public String newsFeed(Model model){
//     //  / ModelAndView model = new ModelAndView();
////        List<Post> posts = postService.getAllPosts();
////        model.addAttribute("posts",posts);
//        return "newsfeed/newsfeed";
//
//    }
}
