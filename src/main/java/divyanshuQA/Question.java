package divyanshuQA;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Question {
	@Id
	private int questionId;
	private String question;
//	private List<String> questionTag;
	
	public Question() {		
	}		
	public Question(int questionId, String question) {
		super();
		this.questionId = questionId;
		this.question = question;
	//	this.questionTag = questionTag;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

}
