package divyanshuQA;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  QuestionRepo extends CrudRepository<Question, Integer> {



}
