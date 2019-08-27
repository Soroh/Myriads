package com.myriadsforjesus.web.app.repositories;

import com.myriadsforjesus.web.app.models.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<PostComment,Long> {
}
