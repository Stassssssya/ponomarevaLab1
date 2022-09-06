package tech.reliab.course.ponomarevaaa.bank.service.impl;

import tech.reliab.course.ponomarevaaa.bank.entity.CreditAccount;
import tech.reliab.course.ponomarevaaa.bank.service.CreditAccountService;

public class CreditAccountServiceImpl implements CreditAccountService {

    private CreditAccount creditAccount;

    /**
     * Метод для получения кредитного счета
     * @author PonomarevaAA
     */
    @Override
    public CreditAccount get() {
        return creditAccount;
    }

    /**
     * Метод для добавления кредитного счета
     * @author PonomarevaAA
     */
    @Override
    public void add(CreditAccount creditAccount) {
        this.creditAccount = creditAccount;
    }

    /**
     * Метод для обновления кредитного счета
     * @author PonomarevaAA
     */
    @Override
    public void update(CreditAccount creditAccount) {
        this.creditAccount.setUser(creditAccount.getUser());
        this.creditAccount.setBankName(creditAccount.getBankName());
        this.creditAccount.setStartDate(creditAccount.getStartDate());
        this.creditAccount.setEndDate(creditAccount.getEndDate());
        this.creditAccount.setMonthCount(creditAccount.getMonthCount());
        this.creditAccount.setCreditAmount(creditAccount.getCreditAmount());
        this.creditAccount.setMonthlyPayment(creditAccount.getMonthlyPayment());
        this.creditAccount.setInterestRate(creditAccount.getInterestRate());
        this.creditAccount.setEmployee(creditAccount.getEmployee());
        this.creditAccount.setPaymentAccount(creditAccount.getPaymentAccount());

    }

    /**
     * Метод для удаления кредитного счета
     * @author PonomarevaAA
     */
    @Override
    public void delete() {
        this.creditAccount = null;
    }
}
