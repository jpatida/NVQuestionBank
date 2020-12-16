package com.questionbank.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class QuestionBankModel
{
//Defining book id as primary key
@Id
@Column
private int questionid;
@Column
private String question;
@Column
private String author;
@Column
private String answer;
public int getQuestionid() {
	return questionid;
}
public void setQuestionid(int questionid) {
	this.questionid = questionid;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}



}