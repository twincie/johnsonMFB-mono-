package com.johnson.johnsonMFB.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    private Data date;
    private String type;

//    @ManyToOne
//    @JoinColumn(name = "wallet_id")
//    private Wallet wallet;
}
