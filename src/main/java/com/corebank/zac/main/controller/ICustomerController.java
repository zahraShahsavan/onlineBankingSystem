package com.corebank.zac.main.controller;

import com.corebank.zac.main.model.ECustomer;

import java.util.List;

public interface ICustomerController {
    public String addCustomer(ECustomer customer);
    public List<ECustomer> getCustomer(long id);
    public List<ECustomer> getCustomers();
    public String updateCustomer(ECustomer customer) throws NoSuchFieldException;
    public String deleteCustomer(long id);
}
