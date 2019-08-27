package com.myriadsforjesus.web.app.controllers;

import com.myriadsforjesus.web.app.models.PostComment;
import com.myriadsforjesus.web.app.service.CommentService;
import com.myriadsforjesus.web.app.service.MyriadService;
import com.myriadsforjesus.web.app.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;
    @Autowired
    private MyriadService myriadService;
    @Autowired
    private PostService postService;

    @RequestMapping("/newsfeed/comment")
    public @ResponseBody
    String  newsFeed(@RequestParam Long postId,@RequestParam String message, @RequestParam Long myriadId){
        PostComment postComment = new PostComment(myriadService.findById(myriadId),postService.findById(postId),message );
        commentService.save(postComment);





//        ModelAndView model = new ModelAndView();
//        List<Post> posts = postService.getAllPosts();
//        model.addObject("posts",posts);
//        model.setViewName("newsfeed/newsfeed");
//        posts.stream().forEach(x->{
//            System.out.println(x);
//        });
        return "newsfeed/newsfeed";
    }
}
