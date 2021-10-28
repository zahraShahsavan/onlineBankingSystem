package com.corebank.zac.main.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name = "CSTMR")
public class ECustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cif;

    @Column(nullable = false,name = "CSTMRNME")
    private String name;

    @Column(nullable = false,name = "CSTMTRNATNALCD")
    private long nationalCode;

    @Column(nullable = true,name = "CSTMTRAG")
    private int age;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "customer")
    List<EAccount> accounts = new ArrayList<>();

    public ECustomer(String name, long nationalCode, int age) {
        this.name = name;
        this.nationalCode = nationalCode;
        this.age = age;
    }

    public ECustomer() {
    }
}
