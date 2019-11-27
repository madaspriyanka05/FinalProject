package com.lti.Interface;

import java.time.LocalDate;
import java.util.List;

import com.lti.entity.Transaction;

public interface TransactionInterface {

	public List<Transaction> fetch(int accId, LocalDate startDate, LocalDate endDate);
}
