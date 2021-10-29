package com.corebank.zac.main.model;

import com.googlecode.jmapper.annotations.JGlobalMap;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "ACCNT")
@JGlobalMap
public class EAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long aid;

    private long cif;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CSTMR", nullable = false)
    private ECustomer customer;

    @Column(name = "ACCNTAMT")
    private long amount;

    @Override
    public String toString() {
        return "EAccount{" +
                "aid=" + aid +
                ", cif=" + customer+
                ", amount=" + amount +
                '}';
    }
}
