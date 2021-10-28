package com.corebank.zac.main.repository.impl;

import com.corebank.zac.main.model.ECustomer;
import com.corebank.zac.main.repository.ICustomerRepo;

import java.util.Optional;

public class CustomerRepo implements ICustomerRepo {
    @Override
    public <S extends ECustomer> S save(S s) {
        return save(s);
    }

    @Override
    public <S extends ECustomer> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<ECustomer> findById(Long id) {
        return findById(id);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<ECustomer> findAll() {
        return null;
    }

    @Override
    public Iterable<ECustomer> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(ECustomer eCustomer) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends ECustomer> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
