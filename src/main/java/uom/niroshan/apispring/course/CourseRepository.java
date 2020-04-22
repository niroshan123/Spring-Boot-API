package uom.niroshan.apispring.course;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CourseRepository extends CrudRepository<Course, String> {


    Optional<Course> findById(String id);

//  String delete(String id);
}
