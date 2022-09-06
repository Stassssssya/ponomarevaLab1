package tech.reliab.course.ponomarevaaa.bank.service.impl;

import tech.reliab.course.ponomarevaaa.bank.entity.BankAtm;
import tech.reliab.course.ponomarevaaa.bank.service.AtmService;

public class AtmServiceImpl implements AtmService {

    private BankAtm bankAtm;

    /**
     * Метод для получения банкомата
     * @author PonomarevaAA
     */
    @Override
    public BankAtm get() {
        return bankAtm;
    }

    /**
     * Метод для добавления банкомата
     * @author PonomarevaAA
     */
    @Override
    public void add(BankAtm bankAtm) {
        this.bankAtm = bankAtm;
    }

    /**
     * Метод для обновления банкомата
     * @author PonomarevaAA
     */
    @Override
    public void update(BankAtm bankAtm) {
        this.bankAtm.setName(bankAtm.getName());
        this.bankAtm.setAddress(bankAtm.getAddress());
        this.bankAtm.setStatus(bankAtm.getStatus());
        this.bankAtm.setBank(bankAtm.getBank());
        this.bankAtm.setLocation(bankAtm.getLocation());
        this.bankAtm.setMaintenanceEmployee(bankAtm.getMaintenanceEmployee());
        this.bankAtm.setIsPaymentOfMoney(bankAtm.getIsPaymentOfMoney());
        this.bankAtm.setIsDepositingMoney(bankAtm.getIsDepositingMoney());
        this.bankAtm.setAmount(bankAtm.getAmount());
        this.bankAtm.setMaintenanceCost(bankAtm.getMaintenanceCost());
    }

    /**
     * Метод для удаления банкомата
     * @author PonomarevaAA
     */
    @Override
    public void delete() {
        this.bankAtm = null;
    }
}
