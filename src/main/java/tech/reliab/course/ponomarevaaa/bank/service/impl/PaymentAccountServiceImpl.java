package tech.reliab.course.ponomarevaaa.bank.service.impl;

import tech.reliab.course.ponomarevaaa.bank.entity.PaymentAccount;
import tech.reliab.course.ponomarevaaa.bank.service.PaymentAccountService;

public class PaymentAccountServiceImpl implements PaymentAccountService {

    private PaymentAccount paymentAccount;

    /**
     * Метод для получения платежного счета
     * @author PonomarevaAA
     */
    @Override
    public PaymentAccount get() {
        return paymentAccount;
    }

    /**
     * Метод для добавления платежного счета
     * @author PonomarevaAA
     */
    @Override
    public void add(PaymentAccount paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    /**
     * Метод для обновления платежного счета
     * @author PonomarevaAA
     */
    @Override
    public void update(PaymentAccount paymentAccount) {
        this.paymentAccount.setUser(paymentAccount.getUser());
        this.paymentAccount.setBank(paymentAccount.getBank());
        this.paymentAccount.setAmount(paymentAccount.getAmount());
    }

    /**
     * Метод для удаления платежного счета
     * @author PonomarevaAA
     */
    @Override
    public void delete() {
        this.paymentAccount = null;
    }
}
