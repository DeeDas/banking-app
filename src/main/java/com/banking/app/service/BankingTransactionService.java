package com.banking.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.banking.app.model.BankingTransaction;
import com.banking.app.repo.TransactionEntity;
import com.banking.app.repo.TransactionRepo;

public class BankingTransactionService implements IBankingService {

	@Autowired
	TransactionRepo repo;
	
	public void saveTransaction(BankingTransaction request) {
		// TODO Auto-generated method stub
		TransactionEntity entity =converterToTransactionEntity(request);
		repo.save(entity);
	}

	private TransactionEntity converterToTransactionEntity(BankingTransaction request) {
		// TODO Auto-generated method stub
		TransactionEntity entity = new TransactionEntity();
		entity.setUserId(request.getUserId());
		entity.setAccountNumber(request.getAccountNumber());
		entity.setRmtrAccountIfsc(request.getSaccountIfsc());
		entity.setRmtrAccountNumber(request.getSaccountNumber());
		entity.setRmtrAccountType(request.getSaccountType());
		entity.setRmtrFullName(request.getFullName());
		entity.setUtrNumber(request.getUtr());
		//entity.setTxnRemark(request.getRmtrToBeneNote());
		entity.setTxnMode(request.getTxnMode());
		entity.setValidateStatus("RECEIVED");
		entity.setAmount(request.getAmount());
		
		return null;
	}

	public List<BankingTransaction> getTransactions(String userId) {
		// TODO Auto-generated method stub
		List<TransactionEntity> entity = repo.findByUserId(userId);
		List<BankingTransaction> transactions = converterToBankingTransaction(entity);
		return transactions;
	}

	private List<BankingTransaction> converterToBankingTransaction(List<TransactionEntity> entity) {
		// TODO Auto-generated method stub
		List<BankingTransaction> transactions = new ArrayList<BankingTransaction>();
		entity.forEach(each->{
			BankingTransaction bt=new BankingTransaction();
			bt.setAccountNumber(each.getAccountNumber());
			bt.setUserId(each.getUserId());
			bt.setSaccountIfsc(each.getRmtrAccountIfsc());
			bt.setSaccountNumber(each.getRmtrAccountNumber());
			bt.setTxnMode(each.getTxnMode());
			bt.setAmount(each.getAmount());
			bt.setUtr(each.getUtrNumber());
			bt.setValidateStatus(each.getValidateStatus());
			transactions.add(bt);
			
		});
		return transactions;
	}

	
}
