package com.johnson.johnsonMFB.controller;

import com.johnson.johnsonMFB.entity.Wallet;
import com.johnson.johnsonMFB.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/controller")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @PostMapping
    public Wallet createWallet(@RequestBody Wallet wallet){
        return walletService.create(wallet);
    }
    @GetMapping("/{id}")
    public Optional<Wallet> readOneWallet(@PathVariable Long id){
        return walletService.readOne(id);
    }
    @GetMapping
    public List<Wallet> readAllWallets(){
        return walletService.readAll();
    }
    @PutMapping("/{id}")
    public Wallet updateWallet(@PathVariable Long id, @RequestBody Wallet wallet){
        return walletService.update(id, wallet);
    }
    @DeleteMapping("/{id}")
    public void deleteWallet(@PathVariable Long id){
        walletService.delete(id);
    }
}
