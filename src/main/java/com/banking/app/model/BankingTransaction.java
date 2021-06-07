package com.banking.app.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value=Include.NON_NULL)
public class BankingTransaction {
	
	private Long userId;

	private BigDecimal amount; 

	private String ackRefId;

	private String utr;
	private String txnRefId;

	private String bankPrefix;

	private String accountNumber;

    private String validateStatus;

	private String txnStatus;


	private String txnRemark;

    private String validateMessage;

	private String utrNumber; 

	private String txnMode;

	private String saccountNumber;

	private String saccountIfsc;

	private String saccountType;

	private String fullName;

	private Date createdDate;

    private Date ackDate;
	
	private Date updatedDate;

	private String provider;
	private String transferType;

	public String getUtr() {
		return utr;
	}

	public void setUtr(String utr) {
		this.utr = utr;
	}

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	private String transactionMetadata;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getAckRefId() {
		return ackRefId;
	}

	public void setAckRefId(String ackRefId) {
		this.ackRefId = ackRefId;
	}

	public String getTxnRefId() {
		return txnRefId;
	}

	public void setTxnRefId(String txnRefId) {
		this.txnRefId = txnRefId;
	}

	public String getBankPrefix() {
		return bankPrefix;
	}

	public void setBankPrefix(String bankPrefix) {
		this.bankPrefix = bankPrefix;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getValidateStatus() {
		return validateStatus;
	}

	public void setValidateStatus(String validateStatus) {
		this.validateStatus = validateStatus;
	}

	public String getTxnStatus() {
		return txnStatus;
	}

	public void setTxnStatus(String txnStatus) {
		this.txnStatus = txnStatus;
	}

	public String getTxnRemark() {
		return txnRemark;
	}

	public void setTxnRemark(String txnRemark) {
		this.txnRemark = txnRemark;
	}

	public String getValidateMessage() {
		return validateMessage;
	}

	public void setValidateMessage(String validateMessage) {
		this.validateMessage = validateMessage;
	}

	public String getUtrNumber() {
		return utrNumber;
	}

	public void setUtrNumber(String utrNumber) {
		this.utrNumber = utrNumber;
	}

	public String getTxnMode() {
		return txnMode;
	}

	public void setTxnMode(String txnMode) {
		this.txnMode = txnMode;
	}




	public String getSaccountNumber() {
		return saccountNumber;
	}

	public void setSaccountNumber(String saccountNumber) {
		this.saccountNumber = saccountNumber;
	}

	public String getSaccountIfsc() {
		return saccountIfsc;
	}

	public void setSaccountIfsc(String saccountIfsc) {
		this.saccountIfsc = saccountIfsc;
	}

	public String getSaccountType() {
		return saccountType;
	}

	public void setSaccountType(String saccountType) {
		this.saccountType = saccountType;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getAckDate() {
		return ackDate;
	}

	public void setAckDate(Date ackDate) {
		this.ackDate = ackDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getTransactionMetadata() {
		return transactionMetadata;
	}

	public void setTransactionMetadata(String transactionMetadata) {
		this.transactionMetadata = transactionMetadata;
	}

	
}
