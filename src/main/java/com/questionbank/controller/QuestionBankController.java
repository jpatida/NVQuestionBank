package com.questionbank.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.questionbank.model.QuestionBankModel;
import com.questionbank.service.QuestionBankService;
//mark class as Controller
@RestController
public class QuestionBankController 
{
//autowire the BooksService class
@Autowired
QuestionBankService questionBankService;
//creating a get mapping that retrieves all the books detail from the database 
@GetMapping("/question")
private List<QuestionBankModel> getAllBooks() 
{
return questionBankService.getAllQuestionAndAnswer();
}
//creating a get mapping that retrieves the detail of a specific book
@GetMapping("/question/{questionid}")
private QuestionBankModel getBooks(@PathVariable("questionid") int bookid) 
{
return questionBankService.getQuestionById(bookid);
}
//creating a delete mapping that deletes a specified book
@DeleteMapping("/question/{questionid}")
private void deleteRecord(@PathVariable("questionid") int bookid) 
{
questionBankService.delete(bookid);
}
//creating post mapping that post the book detail in the database
@PostMapping("/questions")
private int saveBook(@RequestBody QuestionBankModel questionBankModel) 
{
questionBankService.saveOrUpdate(questionBankModel);
return questionBankModel.getQuestionid();
}
//creating put mapping that updates the book detail 
@PutMapping("/questions")
private QuestionBankModel update(@RequestBody QuestionBankModel questionBankModel) 
{
questionBankService.saveOrUpdate(questionBankModel);
return questionBankModel;
}
}
