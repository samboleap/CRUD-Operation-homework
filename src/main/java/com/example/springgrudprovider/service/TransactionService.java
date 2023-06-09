package com.example.springgrudprovider.service;

import com.example.springgrudprovider.model.Transaction;
import com.example.springgrudprovider.model.request.TransactionRequest;
import com.github.pagehelper.PageInfo;
import jakarta.validation.Valid;

public interface TransactionService {
    PageInfo<Transaction> getAllTransactions(int page,int size, String filterName);
    int createNewTransaction(@Valid TransactionRequest transaction);
    int deleteTransactionById(int id);
    int updateTransaction(TransactionRequest trequest, int id);
}
