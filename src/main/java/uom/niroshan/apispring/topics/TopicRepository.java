package uom.niroshan.apispring.topics;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TopicRepository extends CrudRepository<Topic, String> {


    Optional<Topic> findById(String id);

//  String delete(String id);
}
