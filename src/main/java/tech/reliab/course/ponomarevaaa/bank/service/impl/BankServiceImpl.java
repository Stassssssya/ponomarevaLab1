package tech.reliab.course.ponomarevaaa.bank.service.impl;

import tech.reliab.course.ponomarevaaa.bank.entity.Bank;
import tech.reliab.course.ponomarevaaa.bank.service.BankService;

public class BankServiceImpl implements BankService {

    private Bank bank;

    /**
     * Метод для получения банка
     * @author PonomarevaAA
     */
    @Override
    public Bank get() {
        return bank;
    }

    /**
     * Метод для добавления банка
     * @author PonomarevaAA
     */
    @Override
    public void add(Bank bank) {
        this.bank = bank;
    }

    /**
     * Метод для обновления банка
     * @author PonomarevaAA
     */
    @Override
    public void update(Bank bank) {
        this.bank.setName(bank.getName());
        this.bank.setOfficeCount(bank.getOfficeCount());
        this.bank.setBankAtmCount(bank.getBankAtmCount());
        this.bank.setEmployeeCount(bank.getEmployeeCount());
        this.bank.setUserCount(bank.getUserCount());
        this.bank.setRating(bank.getRating());
        this.bank.setTotalAmount(bank.getTotalAmount());
        this.bank.setInterestRate(bank.getInterestRate());
    }

    /**
     * Метод для удаления банка
     * @author PonomarevaAA
     */
    @Override
    public void delete() {
        this.bank = null;
    }
}
