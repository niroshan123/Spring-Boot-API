package uom.niroshan.apispring.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics")
    public List<Course> getAllTopics(){
        return courseService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Optional<Course> getTopicById(@PathVariable("id") String id)//request mapping ena id eka methena id eka kiyla kiynne path variable ekan
    {
        return courseService.getTopic(id);
    }

    @PostMapping("/topics")
    public String addTopic(@RequestBody Course topic ){
       return courseService.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public String updateTopic(@PathVariable("id") String id, @RequestBody Course topic){
        return courseService.updateTopic(id,topic);
    }

    @DeleteMapping("/topics/{id}")
    public String deleteTopic(@PathVariable("id") String id){
        return courseService.deleteTopic(id);
    }

}
