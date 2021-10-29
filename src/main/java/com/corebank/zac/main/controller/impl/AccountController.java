package com.corebank.zac.main.controller.impl;

import com.corebank.zac.main.controller.IAccountController;
import com.corebank.zac.main.dto.request.AddAccountRequest;
import com.corebank.zac.main.exception.AccountNotFoundException;
import com.corebank.zac.main.model.EAccount;
import com.corebank.zac.main.repository.IAccountRepo;
import com.corebank.zac.main.repository.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

import static com.googlecode.jmapper.api.JMapperAPI.attribute;
import static com.googlecode.jmapper.api.JMapperAPI.mappedClass;

@RestController
@RequestMapping("/account")
public class AccountController implements IAccountController {

    @Autowired
    private IAccountRepo accountRepo;

    @Autowired
    private ICustomerRepo customerRepo;

    @GetMapping("/add")
    @Override
    public String addAccount(AddAccountRequest request) {

//        JMapperAPI jmapperApi = new JMapperAPI()
//                .add(mappedClass(AddAccountRequest.class)
//                        .add(attribute("amount").value("amount")));
//
//        JMapper<EAccount,AddAccountRequest> accountMapper= new JMapper<EAccount,AddAccountRequest>(
//                EAccount.class,AddAccountRequest.class,jmapperApi);
        EAccount account = new EAccount();
        account.setAmount(request.getAmount());
        account.setCustomer(customerRepo.findById(request.getCustomerId()).get());
        EAccount eAccount = accountRepo.save(account);
        return "account "+eAccount.getAid()+" added for customer "+eAccount.getCif();
    }

    @GetMapping("/get")
    @Override
    public List<EAccount> getAccount(@RequestParam("id") long id) {

        Iterable<EAccount> accounts = accountRepo.findAllById(Collections.singleton(id));
        if(accounts == null)
            return (List<EAccount>) new EAccount();
        return (List<EAccount>) accounts.iterator().next();
    }

    @GetMapping("/getList")
    @Override
    public List<EAccount> getAccounts() {
        return (List<EAccount>) accountRepo.findAll();
    }

    @GetMapping("/update")
    @Override
    public String updateAccount(EAccount account){
        if (!accountRepo.existsById(account.getAid()))
            throw new AccountNotFoundException();
        account.setCustomer(customerRepo.findById(account.getCif()).get());
        EAccount eAccount = accountRepo.save(account);
        return "account "+ eAccount.getAid()+" has just updated";
    }

    @GetMapping("/delete")
    @Override
    public String deleteAccount(long id) {
        accountRepo.deleteById(id);
        return "account "+id+" deleted";
    }
}
