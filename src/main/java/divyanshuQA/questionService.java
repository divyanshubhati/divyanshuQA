package divyanshuQA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class questionService {
	@Autowired
	private QuestionRepo queRepo;

	/*private List<Question> questionBank = new ArrayList<>(Arrays.asList(new Question(100,"Who invented JAVA?", Arrays.asList("JAVA")),
			new Question(101,"Which JAVA version is compatable with Glassfish server 4 ?", Arrays.asList("JAVA","Glassfish")),
			new Question(102,"What is null pointer Exception?", Arrays.asList("JAVA"))
			));*/

	public List<Question> getAllQuestions() {
		List<Question> qs = new ArrayList<>();
		queRepo.findAll().forEach(qs::add);
		return qs;
	}

	public void addQuestion(Question newQuestion) {
		System.out.println(newQuestion);
		queRepo.save(newQuestion);
	}
}
