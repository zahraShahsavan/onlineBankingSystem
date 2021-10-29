package com.corebank.zac.main.controller;

import com.corebank.zac.main.dto.request.AddAccountRequest;
import com.corebank.zac.main.model.EAccount;

import java.util.List;

public interface IAccountController {
    public String addAccount(AddAccountRequest account);
    public List<EAccount> getAccount(long id);
    public List<EAccount> getAccounts();
    public String updateAccount(EAccount account) throws NoSuchFieldException;
    public String deleteAccount(long id);
}
