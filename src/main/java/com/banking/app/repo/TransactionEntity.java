package com.banking.app.repo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TransactionEntity {
	public static final String UNIQUE_KEY_UNIQUE_ID = "uk_ecollect_transaction_unique_id";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "amount")
	private BigDecimal amount; 

	@Column(name = "ack_ref_id")
	private String ackRefId;

	@Column(name = "txn_ref_id")
	private String txnRefId;

	@Column(name = "bank_prefix")
	private String bankPrefix;

	@Column(name = "account_number")
	private String accountNumber;

    @Column(name = "validate_status")
    private String validateStatus;

	@Column(name = "txn_status")
	private String txnStatus;

	@Column(name = "txn_remark")
	private String txnRemark;

    @Column(name = "validate_message")
    private String validateMessage;

	@Column(name = "utr_number")
	private String utrNumber; 

	@Column(name = "txn_mode")
	private String txnMode;

	@Column(name = "rmtraccount_number")
	private String rmtrAccountNumber;

	@Column(name = "rmtr_account_ifsc")
	private String rmtrAccountIfsc;

	@Column(name = "rmtr_account_type")
	private String rmtrAccountType;

	@Column(name = "rmtr_full_name")
	private String rmtrFullName;

	@Column(name = "created_date")
	private Date createdDate;

    @Column(name = "ack_date")
    private Date ackDate;

	@Column(name = "updated_date")
	private Date updatedDate;

	@Column(name = "provider")
	private String provider;

	@Column(name = "transaction_metadata")
	private String transactionMetadata;

	@Column(name = "receiving_channel")
	private String receivingChannel = "API";

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getRmtrAccountNumber() {
		return rmtrAccountNumber;
	}

	public void setRmtrAccountNumber(String rmtrAccountNumber) {
		this.rmtrAccountNumber = rmtrAccountNumber;
	}

	public String getRmtrAccountIfsc() {
		return rmtrAccountIfsc;
	}

	public void setRmtrAccountIfsc(String rmtrAccountIfsc) {
		this.rmtrAccountIfsc = rmtrAccountIfsc;
	}

	public String getRmtrAccountType() {
		return rmtrAccountType;
	}

	public void setRmtrAccountType(String rmtrAccountType) {
		this.rmtrAccountType = rmtrAccountType;
	}

	public String getRmtrFullName() {
		return rmtrFullName;
	}

	public void setRmtrFullName(String rmtrFullName) {
		this.rmtrFullName = rmtrFullName;
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

	public String getReceivingChannel() {
		return receivingChannel;
	}

	public void setReceivingChannel(String receivingChannel) {
		this.receivingChannel = receivingChannel;
	}

	public static String getUniqueKeyUniqueId() {
		return UNIQUE_KEY_UNIQUE_ID;
	}
	
}
