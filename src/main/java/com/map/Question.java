package com.map;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {
    @Id
    @Column(name="question_id")
    private int questionId;
    private String question;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    @OneToOne
    @JoinColumn(name="a_id")
    private Answer answer;

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

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public Question(int questionId, String question, List<Answer> answers, Answer answer) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
        this.answer = answer;
    }

    public Question(){
        super();
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
