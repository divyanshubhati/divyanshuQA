package divyanshuQA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class questionController {
@Autowired
private questionService sample;

@RequestMapping("/questions")
public List<Question> getAllQuestions(){
	return sample.getAllQuestions();	
	
}

@RequestMapping(method=RequestMethod.POST, value="/questions")
public void addQuestion(@RequestBody Question newQuestion ) {
	
      sample.addQuestion(newQuestion);	
}

    @RequestMapping(method=RequestMethod.GET, value="/test")
    public String deleteTopics() {
        return  "Hello";
    }


}
