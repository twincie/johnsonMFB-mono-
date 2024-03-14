package com.johnson.johnsonMFB.repository;

import com.johnson.johnsonMFB.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallet,Long> {

    public Long findByAccountNumber(Long accountNumber);
}
