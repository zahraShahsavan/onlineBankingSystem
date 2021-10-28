package com.corebank.zac.main.repository.impl;

import com.corebank.zac.main.model.EAccount;
import com.corebank.zac.main.model.ECustomer;
import com.corebank.zac.main.repository.IAccountRepo;

import java.util.Optional;

public class AccountRepo implements IAccountRepo {

    @Override
    public <S extends EAccount> S save(S s) {
        return save(s);
    }

    @Override
    public <S extends EAccount> Iterable<S> saveAll(Iterable<S> iterable) {
        return saveAll(iterable);
    }

    @Override
    public Optional<EAccount> findById(Long aLong) {
        return findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<EAccount> findAll() {
        return findAll();
    }

    @Override
    public Iterable<EAccount> findAllById(Iterable<Long> iterable) {
        return findAllById(iterable);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(EAccount account) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends EAccount> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
