package com.example.springgrudprovider.service.serviceimpl;

import com.example.springgrudprovider.model.Transaction;
import com.example.springgrudprovider.model.request.TransactionRequest;
import com.example.springgrudprovider.repository.TransactionRepository;
import com.example.springgrudprovider.service.TransactionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    
    private final TransactionRepository transactionRepository;
    @Override
    public PageInfo<Transaction> getAllTransactions(int page, int size, String filterName) {
        PageHelper.startPage(page,size);
        return new PageInfo<>(transactionRepository.getAllTransactions(filterName));
    }

    @Override
    public int createNewTransaction(TransactionRequest trequest) {
        return transactionRepository.createNewTransaction(trequest);
    }

    @Override
    public int deleteTransactionById(int id) {
        return transactionRepository.deleteTransactionById(id);
    }

    @Override
    public int updateTransaction(TransactionRequest trequest, int id) {
        return transactionRepository.updateTransaction(trequest, id);
    }
}
