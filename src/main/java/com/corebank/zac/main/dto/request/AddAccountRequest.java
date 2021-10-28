package com.corebank.zac.main.dto.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class AddAccountRequest implements Serializable {
    private long customerId;
    private long amount;
}
