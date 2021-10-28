package com.corebank.zac;

import com.corebank.zac.main.model.ECustomer;
import com.corebank.zac.main.repository.impl.CustomerRepo;
import com.corebank.zac.main.repository.ICustomerRepo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ZacApplicationTests {


    @Test
    public void create() {
       /* ICustomerRepo customerRepo = new CustomerRepo();
        ECustomer customer = new ECustomer("test",123,20);
        ECustomer customerTest = customerRepo.save(customer);
        assertEquals(customer,customerTest);*/
    }

}
