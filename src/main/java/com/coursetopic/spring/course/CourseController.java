package com.coursetopic.spring.course;

import com.coursetopic.spring.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;
    @RequestMapping("/topic/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return courseService.getCourses(id);
    }

    @RequestMapping("/topic/{topicid}/course/{courseid}")
    public Optional<Course> getCourse(@PathVariable String courseid){
        return courseService.getCourse(courseid);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topic/{topicid}/courses")
    public void addCourse(@RequestBody Course course,@PathVariable String topicid){
        course.setTopic(new Topic(topicid,"",""));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topic/{topicid}/courses/{courseid}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicid){
        course.setTopic(new Topic(topicid,"",""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topic/{topicid}/courses/{courseid}")
    public void deleteCourse(@PathVariable String courseid){
        courseService.deleteCourse(courseid);
    }


}
