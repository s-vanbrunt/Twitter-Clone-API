package com.cooksys.assessment1.repositories;

import com.cooksys.assessment1.entities.Tweet;
import com.cooksys.assessment1.entities.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    List<Tweet> findByDeletedFalseOrderByPostedDesc();

    List<Tweet> findByInReplyToAndDeletedFalseOrderByPostedDesc(Tweet tweet);

    List<Tweet> findByRepostOfAndDeletedFalseOrderByPostedDesc(Tweet tweet);
    
    List<User> findByMentionedByAndDeletedFalse(Tweet tweet);

}
