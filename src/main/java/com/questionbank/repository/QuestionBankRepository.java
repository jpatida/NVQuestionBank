package com.questionbank.repository;
import org.springframework.data.repository.CrudRepository;

import com.questionbank.model.QuestionBankModel;
public interface QuestionBankRepository extends CrudRepository<QuestionBankModel, Integer>
{
	
}
