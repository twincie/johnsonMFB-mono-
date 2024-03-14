package com.johnson.johnsonMFB.controller;

import com.johnson.johnsonMFB.entity.Transaction;
import com.johnson.johnsonMFB.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return transactionService.create(transaction);
    }
    @GetMapping("/{id}")
    public Optional<Transaction> readOneTransaction(@PathVariable Long id){
        return transactionService.readOne(id);
    }
    @GetMapping
    public List<Transaction> readAllTransactions(){
        return transactionService.readAll();
    }
    @PutMapping("/{id}")
    public Transaction updateTransaction(@PathVariable Long id, @RequestBody Transaction transaction){
        return transactionService.update(id, transaction);
    }
    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id){
        transactionService.delete(id);
    }
}
