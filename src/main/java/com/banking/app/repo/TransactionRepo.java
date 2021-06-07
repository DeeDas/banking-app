package com.banking.app.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TransactionRepo extends CrudRepository<TransactionEntity,String>{
	public List<TransactionEntity> findByUserId(String userId);
}
