package uom.niroshan.apispring.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private  TopicRepository topicRepository;

//          private List<Topic> topics= new ArrayList<> (Arrays.asList(
//                new Topic("1","Spring","Spring-Boot Introduction"),
//                new Topic("2","Angular","Angular 7 Introduction"),
//                new Topic("3","Sql","MySql Introduction")
//        ));

           public List<Topic> getAllTopics(){

               List<Topic> topics=new ArrayList<>();
               topicRepository.findAll().forEach(topics::add);//find karala okkoma ekakata dagannwaaaa
               return topics;
           }

           public Optional<Topic> getTopic(String id){


           return topicRepository.findById(id);

//               return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
           }

    public String addTopic(Topic topic) {
               topicRepository.save(topic);
               return "Topic created";
    }

    public String updateTopic(String id, Topic topic) {

//               for(int i=0;i<topics.size();i++){
//                   Topic t=topics.get(i);
//                           if(t.getId().equals(id)){
//                              topics.set(i,topic);
//
//                           }
//               }
        topicRepository.save(topic);
            return "Updated";

    }

    public String deleteTopic(String id) {
//               for(int i=0;i<topics.size();i++){
//                   Topic t= topics.get(i);
//                   if(t.getId().equals(id)){
//                       topics.remove(i);
//                   }
//               }
//         topics.removeIf(t->t.getId().equals(id));

        topicRepository.deleteById(id);

        return "Deleted";
    }
}
