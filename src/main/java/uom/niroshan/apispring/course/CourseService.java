package uom.niroshan.apispring.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

//          private List<Topic> topics= new ArrayList<> (Arrays.asList(
//                new Topic("1","Spring","Spring-Boot Introduction"),
//                new Topic("2","Angular","Angular 7 Introduction"),
//                new Topic("3","Sql","MySql Introduction")
//        ));

           public List<Course> getAllCourses(){

               List<Course> topics=new ArrayList<>();
               courseRepository.findAll().forEach(topics::add);//find karala okkoma ekakata dagannwaaaa
               return topics;
           }

           public Optional<Course> getCourse(String id){


           return courseRepository.findById(id);

//               return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
           }

    public String addCourse(Course topic) {
        courseRepository.save(topic);
               return "Topic created";
    }

    public String updateCourse(String id, Course topic) {

              /* for(int i=0;i<topics.size();i++){
                   Topic t=topics.get(i);
                           if(t.getId().equals(id)){
                              topics.set(i,topic);
                           }
               }*/

        courseRepository.save(topic);
            return "Updated";

    }

    public String deleteCourse(String id) {
            /*   for(int i=0;i<topics.size();i++){
                   Topic t= topics.get(i);
                   if(t.getId().equals(id))
                   {topics.remove(i);}
               }
         topics.removeIf(t->t.getId().equals(id));*/

        courseRepository.deleteById(id);

        return "Deleted";
    }
}
