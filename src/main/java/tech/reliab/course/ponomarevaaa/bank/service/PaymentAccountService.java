package tech.reliab.course.ponomarevaaa.bank.service;

import tech.reliab.course.ponomarevaaa.bank.entity.PaymentAccount;

public interface PaymentAccountService {

    PaymentAccount get();

    void add(PaymentAccount paymentAccount);

    void update(PaymentAccount paymentAccount);

    void delete();
}
