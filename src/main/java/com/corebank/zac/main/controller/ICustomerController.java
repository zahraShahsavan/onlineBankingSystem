package com.corebank.zac.main.controller;

import com.corebank.zac.main.model.ECustomer;

import java.util.List;

public interface ICustomerController {
    public ECustomer addCustomer(ECustomer customer);
    public List<ECustomer> getCustomer(long id);
    public List<ECustomer> getCustomers();
    public ECustomer updateCustomer(ECustomer customer) throws NoSuchFieldException;
    public void deleteCustomer(long id);
}
