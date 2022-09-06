package tech.reliab.course.ponomarevaaa.bank.service;

import tech.reliab.course.ponomarevaaa.bank.entity.CreditAccount;

public interface CreditAccountService {

    CreditAccount get();

    void add(CreditAccount creditAccount);

    void update(CreditAccount creditAccount);

    void delete();
}
