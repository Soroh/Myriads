package com.myriadsforjesus.web.app.service.imple;

import com.myriadsforjesus.web.app.models.PostComment;
import com.myriadsforjesus.web.app.repositories.CommentRepo;
import com.myriadsforjesus.web.app.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepo commentRepo;
    @Override
    public PostComment save(PostComment postComment) {
        return commentRepo.save(postComment);
    }
}
