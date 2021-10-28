package com.corebank.zac.main.repository;

import com.corebank.zac.main.model.EAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepo  extends CrudRepository<EAccount,Long> {
}
