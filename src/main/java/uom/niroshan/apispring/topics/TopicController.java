package uom.niroshan.apispring.topics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopicById(@PathVariable("id") String id)//request mapping ena id eka methena id eka kiyla kiynne path variable ekan
    {
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public String addTopic(@RequestBody Topic topic ){
       return topicService.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public String updateTopic(@PathVariable("id") String id, @RequestBody Topic topic){
        return topicService.updateTopic(id,topic);
    }

    @DeleteMapping("/topics/{id}")
    public String deleteTopic(@PathVariable("id") String id){
        return topicService.deleteTopic(id);
    }

}
