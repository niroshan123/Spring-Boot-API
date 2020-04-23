package uom.niroshan.apispring.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends CrudRepository<Course, String> {


    Optional<Course> findById(String id);
    public List<Course> findByTopicId(String topicId);

//  String delete(String id);
}
