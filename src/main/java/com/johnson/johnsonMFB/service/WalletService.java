package com.johnson.johnsonMFB.service;

import com.johnson.johnsonMFB.entity.Wallet;
import com.johnson.johnsonMFB.repository.TransactionRepository;
import com.johnson.johnsonMFB.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WalletService {
    @Autowired
    private WalletRepository walletRepository;

    @Autowired
//    private TransactionRepository transactionRepository;
    // CRUD methods
    public Wallet create(Wallet wallet){
        return walletRepository.save(wallet);
    }
    public Optional<Wallet> readOne(Long id){
        return walletRepository.findById(id);
    }
    public List<Wallet> readAll(){
        return walletRepository.findAll();
    }
    public Wallet update(Long id, Wallet updater){
        updater.setId(id);
        return walletRepository.save(updater);
    }
    public void delete(Long id){
        walletRepository.deleteById(id);
    }

//    public void (BigDecimal amount){
//        walletRepository.findByAccountNumber()
//
//    }
//    public void topup(BigDecimal amount, Long accountNumber){
//        Wallet wallet;
//        wallet = walletRepository.findByAccountNumber(accountNumber).orElseThrow(() -> new RuntimeException("Wallet not found"));
//        if (amount.compareTo(BigDecimal.ZERO) >= 0){
//            wallet.getAmount().add(amount);
//            walletRepository.save(wallet);
//        }
//    }
//
////    public Wallet topUpWallet(Long walletId, BigDecimal amount){
////        Wallet wallet = walletRepository.findById(walletId);
////        wallet.setAmount(wallet.getAmount().add(amount));
////        walletRepository.save((wallet));
////
////        Transaction transaction = new Transaction();
////        transaction.setWallet(wallet);
////        transaction.setAmount((amount));
////        transaction.setDate();
////        transaction.setType("Top-up");
////        transactionRepository.save(transaction);
////    }
////
////    public void withdrawWallet(Long walletId, BigDecimal amount){
//////        Wallet wallet = walletRepository.findById(walletId);
////        Wallet wallet = walletRepository.findByAccountNumber(walletId);
////        Wallet wallet = walletRepository.findById(walletId);
////        wallet.setAmount(wallet.getAmount().subtract(amount));
////        walletRepository.save(wallet);
////
////        Transaction transaction = new Transaction();
////        transaction.setWallet(wallet);
////        transaction.setAmount((amount));
////        transaction.setDate();
////        transaction.setType("Withdraw");
////        transactionRepository.save(transaction);
////    }
////
////    public void transferToWallet(Long walletId, BigDecimal amount,Long recipientAccountNumber ){
////        walletRepository.findById(walletId);
////        wallet.setAmount(wallet.getAmount().subtract(amount));
////        walletRepository.save(wallet);
////
////        walletRepository.fi
//    }
}
