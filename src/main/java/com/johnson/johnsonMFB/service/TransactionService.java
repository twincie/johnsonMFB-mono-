package com.johnson.johnsonMFB.service;

import com.johnson.johnsonMFB.entity.Transaction;
import com.johnson.johnsonMFB.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    // CRUD methods
    public Transaction create(Transaction transaction){
        return transactionRepository.save(transaction);
    }
    public Optional<Transaction> readOne(Long id){
        return transactionRepository.findById(id);
    }
    public List<Transaction> readAll(){
        return transactionRepository.findAll();
    }
    public Transaction update(Long id, Transaction updater){
        updater.setId(id);
        return transactionRepository.save(updater);
    }
    public void delete(Long id){
        transactionRepository.deleteById(id);
    }
}
