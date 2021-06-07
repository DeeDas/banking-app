package com.banking.app.service;

import java.util.List;

import com.banking.app.model.BankingTransaction;

public interface IBankingService {

	
	void saveTransaction(BankingTransaction request);
	List<BankingTransaction> getTransactions(String userId);
}
