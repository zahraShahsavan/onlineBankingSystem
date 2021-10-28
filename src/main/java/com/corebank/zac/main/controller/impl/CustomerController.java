package com.corebank.zac.main.controller.impl;

import com.corebank.zac.main.controller.ICustomerController;
import com.corebank.zac.main.exception.CustomerNotFoundException;
import com.corebank.zac.main.model.ECustomer;
import com.corebank.zac.main.repository.ICustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController implements ICustomerController {

    @Autowired
    private ICustomerRepo customerRepo;

    @GetMapping("/add")
    @Override
    public ECustomer addCustomer(ECustomer customer) {
        return customerRepo.save(customer);
    }

    @GetMapping("/get")
    @Override
    public List<ECustomer> getCustomer(long id) {
        Optional<ECustomer> customers = customerRepo.findById(id);
        return customers.isPresent()
                ? Collections.singletonList(customers.get())
                : Collections.emptyList();
    }

    @GetMapping("/getList")
    @Override
    public List<ECustomer> getCustomers() {
        return (List<ECustomer>) customerRepo.findAll();
    }

    @GetMapping("/update")
    @Override
    public ECustomer updateCustomer(ECustomer customer){
        if (!customerRepo.existsById(customer.getCif()))
            throw new CustomerNotFoundException();

        return customerRepo.save(customer);

    }

    @GetMapping("/delete")
    @Override
    public void deleteCustomer(long id) {
        customerRepo.deleteById(id);
    }


}
