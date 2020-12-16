package com.questionbank.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questionbank.model.QuestionBankModel;
import com.questionbank.repository.QuestionBankRepository;
//defining the business logic
@Service
public class QuestionBankService 
{
@Autowired
QuestionBankRepository questionBankRepository;
//getting all AllQuestionAndAnswer record by using the method findaAll() of CrudRepository
public List<QuestionBankModel> getAllQuestionAndAnswer() 
{
List<QuestionBankModel> questionBankModel = new ArrayList<QuestionBankModel>();
questionBankRepository.findAll().forEach(allquestion -> questionBankModel.add(allquestion));
return questionBankModel;
}
//getting a specific record by using the method findById() of CrudRepository
public QuestionBankModel getQuestionById(int id) 
{
return questionBankRepository.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(QuestionBankModel questionBankModel) 
{
questionBankRepository.save(questionBankModel);
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int questionid) 
{
questionBankRepository.deleteById(questionid);
}
//updating a record
public void update(QuestionBankModel questionBankModel, int questionid) 
{
questionBankRepository.save(questionBankModel);
}
}