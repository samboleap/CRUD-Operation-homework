package com.example.springgrudprovider.mapper;

import com.example.springgrudprovider.model.Transaction;
import com.example.springgrudprovider.model.response.TransactionResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "Spring")
public interface TransactionMapper {
    List<TransactionResponse> mapToTransactionResponse(List<Transaction> transactions);
    List<Transaction> mapToTransaction(List<TransactionResponse> transactionResponses);
}
