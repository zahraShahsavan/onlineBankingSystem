package com.corebank.zac.main.repository;

import com.corebank.zac.main.model.ECustomer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepo extends CrudRepository<ECustomer,Long> {
}
