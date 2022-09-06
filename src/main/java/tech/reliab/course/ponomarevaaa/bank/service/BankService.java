package tech.reliab.course.ponomarevaaa.bank.service;

import tech.reliab.course.ponomarevaaa.bank.entity.Bank;

public interface BankService {

    Bank get();

    void add(Bank bank);

    void update(Bank bank);

    void delete();
}
