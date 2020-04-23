package uom.niroshan.apispring.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uom.niroshan.apispring.topics.Topic;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable String id)//request mapping ena id eka methena id eka kiyla kiynne path variable ekan
    {
        return courseService.getCourse(id);
    }

    @PostMapping("/topics/{topicId}/courses")
    public String addCourse(@RequestBody Course course,@PathVariable String topicId ){
        course.setTopic(new Topic(topicId,"",""));
        return courseService.addCourse(course);

    }

    @PutMapping("/topics/{topicId}/courses/{id}")
    public String updateCourse( @RequestBody Course course,@PathVariable String topicId,@PathVariable String id){
        course.setTopic(new Topic(topicId,"",""));
        return courseService.updateCourse(course);
    }

    @DeleteMapping("topics/{topicId}/courses/{id}")
    public String deleteCourse(@PathVariable String id)
    {
        return courseService.deleteCourse(id);
    }

}
