package com.corebank.zac.main.controller;

import com.corebank.zac.main.dto.request.AddAccountRequest;
import com.corebank.zac.main.model.EAccount;

public interface IAccountController {
    public String addAccount(AddAccountRequest account);
    public EAccount getAccount(Long id);
    public Iterable<EAccount> getAccounts();
    public EAccount updateAccount(EAccount account) throws NoSuchFieldException;
    public String deleteAccount(long id);
}
