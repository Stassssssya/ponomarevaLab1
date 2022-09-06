package tech.reliab.course.ponomarevaaa.bank.service.impl;

import tech.reliab.course.ponomarevaaa.bank.entity.BankOffice;
import tech.reliab.course.ponomarevaaa.bank.service.BankOfficeService;

public class BankOfficeServiceImpl implements BankOfficeService {

    private BankOffice bankOffice;

    /**
     * Метод для получения офиса
     * @author PonomarevaAA
     */
    @Override
    public BankOffice get() {
        return bankOffice;
    }

    /**
     * Метод для добавления офиса
     * @author PonomarevaAA
     */
    @Override
    public void add(BankOffice bankOffice) {
        this.bankOffice = bankOffice;
    }

    /**
     * Метод для обновления офиса
     * @author PonomarevaAA
     */
    @Override
    public void update(BankOffice bankOffice) {
        this.bankOffice.setName(bankOffice.getName());
        this.bankOffice.setAddress(bankOffice.getAddress());
        this.bankOffice.setStatus(bankOffice.getStatus());
        this.bankOffice.setIsPlacementOfBankAtm(bankOffice.getIsPlacementOfBankAtm());
        this.bankOffice.setBankAtmCount(bankOffice.getBankAtmCount());
        this.bankOffice.setIsLoanProcessing(bankOffice.getIsLoanProcessing());
        this.bankOffice.setIsPaymentOfMoney(bankOffice.getIsPaymentOfMoney());
        this.bankOffice.setIsDepositingMoney(bankOffice.getIsDepositingMoney());
        this.bankOffice.setAmount(bankOffice.getAmount());
        this.bankOffice.setCostOfRenting(bankOffice.getCostOfRenting());

    }

    /**
     * Метод для удаления офиса
     * @author PonomarevaAA
     */
    @Override
    public void delete() {
        this.bankOffice = null;
    }
}
