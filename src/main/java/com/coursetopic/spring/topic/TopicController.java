package com.coursetopic.spring.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("Spring","Spring Framework","This is a Spring object"),
                new Topic("Java","Java Subject","Learn Java")
        );
    }

}
