package tech.reliab.course.ponomarevaaa.bank;

import tech.reliab.course.ponomarevaaa.bank.entity.*;
import tech.reliab.course.ponomarevaaa.bank.enums.BanKOfficeStatusEnum;
import tech.reliab.course.ponomarevaaa.bank.enums.BankAtmStatusEnum;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Bank bank = createBank();
        BankOffice bankOffice = createBankOffice(bank);
        Employee employee = createEmployee(bank, bankOffice);
        BankAtm bankAtm = createBankAtm(bank, bankOffice, employee);
        User user = createUser(bank);
        PaymentAccount paymentAccount = createPaymentAccount(bank, user);
        CreditAccount creditAccount = createCreditAccount(bank, employee, user);

        System.out.println(bank);
        System.out.println(bankOffice);
        System.out.println(employee);
        System.out.println(bankAtm);
        System.out.println(user);
        System.out.println(paymentAccount);
        System.out.println(creditAccount);
    }

    /**
     * Метод для создания банка
     *
     * @author PonomarevaAA
     */
    private static Bank createBank() {
        Bank bank = new Bank();
        bank.setId(1L);
        bank.setName("Тинькофф");
        bank.setRating(new Random().nextInt(100) + 1);
        bank.setTotalAmount(new Random().nextInt(1000000));
        bank.setInterestRate(getRate(bank.getRating()));
        return bank;
    }

    /**
     * Метод для получения ставки банка
     *
     * @author PonomarevaAA
     */
    private static int getRate(Integer rating) {
        return Double.valueOf(20 - (new Random().nextInt(20) + 1) / 100.0 * rating).intValue();
    }

    /**
     * Метод для создания офиса
     *
     * @author PonomarevaAA
     */
    private static BankOffice createBankOffice(Bank bank) {
        bank.setOfficeCount(bank.getOfficeCount() + 1);

        BankOffice bankOffice = new BankOffice();
        bankOffice.setId(1L);
        bankOffice.setName("Офис Тинькофф");
        bankOffice.setAddress("г. Белгород ул. Победы д. 68");
        bankOffice.setStatus(BanKOfficeStatusEnum.WORK);
        bankOffice.setIsPlacementOfBankAtm(true);
        bankOffice.setBankAtmCount(bank.getBankAtmCount());
        bankOffice.setIsLoanProcessing(true);
        bankOffice.setIsPaymentOfMoney(true);
        bankOffice.setIsDepositingMoney(true);
        bankOffice.setAmount(bank.getTotalAmount());
        bankOffice.setCostOfRenting(50000);
        return bankOffice;
    }

    /**
     * Метод для создания сотрудника
     *
     * @author PonomarevaAA
     */
    private static Employee createEmployee(Bank bank, BankOffice bankOffice) {
        bank.setEmployeeCount(bank.getEmployeeCount() + 1);

        Employee employee = new Employee();
        employee.setId(1L);
        employee.setFullName("Авдеева Ярослава Дмитриевна");
        employee.setDateOfBirth(LocalDate.of(1991, 12, 7));
        employee.setJobTitle("Ведущий аналитик");
        employee.setBank(bank);
        employee.setIsDistantWork(false);
        employee.setBankOffice(bankOffice);
        employee.setIsIssuanceOfCredit(true);
        employee.setSalary(200000);
        return employee;
    }

    /**
     * Метод для создания банкомата
     *
     * @author PonomarevaAA
     */
    private static BankAtm createBankAtm(Bank bank, BankOffice bankOffice, Employee employee) {
        bank.setBankAtmCount(bank.getBankAtmCount() + 1);
        bankOffice.setBankAtmCount(bankOffice.getBankAtmCount() + 1);

        BankAtm bankAtm = new BankAtm();
        bankAtm.setId(1L);
        bankAtm.setName("Банкомат Тинькофф");
        bankAtm.setAddress("г. Белгород ул. Победы д. 68");
        bankAtm.setStatus(BankAtmStatusEnum.WORK);
        bankAtm.setBank(bank);
        bankAtm.setLocation(bankOffice.getName());
        bankAtm.setMaintenanceEmployee(employee);
        bankAtm.setIsPaymentOfMoney(true);
        bankAtm.setIsDepositingMoney(true);
        bankAtm.setAmount(bank.getTotalAmount());
        bankAtm.setMaintenanceCost(90000);
        return bankAtm;
    }

    /**
     * Метод для создания клиента
     *
     * @author PonomarevaAA
     */
    private static User createUser(Bank bank) {
        bank.setUserCount(bank.getUserCount() + 1);

        User user = new User();
        user.setId(1L);
        user.setFullName("Максимов Александр Витальевич");
        user.setDateOfBirth(LocalDate.of(1995, 4, 21));
        user.setPlaceOfWork("ООО ПИРС");
        user.setSalary(new Random().nextInt(10000));
        user.setBank(bank);
        user.setRatingForBank(getUserRating(user.getSalary()));
        return user;
    }

    /**
     * Метод для получения рейтинга клиента
     *
     * @author PonomarevaAA
     */
    private static Integer getUserRating(Integer salary) {
        return Double.valueOf(Math.ceil(salary / 1000.0) * 100).intValue();
    }

    /**
     * Метод для создания кредитного счета
     *
     * @author PonomarevaAA
     */
    private static PaymentAccount createPaymentAccount(Bank bank, User user) {
        PaymentAccount paymentAccount = new PaymentAccount();
        paymentAccount.setId(1L);
        paymentAccount.setBankName(bank.getName());
        paymentAccount.setAmount(5000);

//        user.setPaymentAccount(paymentAccount);
        paymentAccount.setUser(user);

        return paymentAccount;
    }

    /**
     * Метод для создания кредитного счета
     *
     * @author PonomarevaAA
     */
    private static CreditAccount createCreditAccount(Bank bank, Employee employee, User user) {
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.setId(1L);
        creditAccount.setBankName(bank.getName());
        creditAccount.setStartDate(LocalDate.of(2021, 4, 21));
        creditAccount.setEndDate(LocalDate.of(2025, 4, 21));
        creditAccount.setMonthCount(30);
        creditAccount.setCreditAmount(500000);
        creditAccount.setMonthlyPayment(15000);
        creditAccount.setInterestRate(new Random().nextInt(bank.getInterestRate()));
        creditAccount.setEmployee(employee);
        creditAccount.setPaymentAccount(user.getPaymentAccount());

//        user.setCreditAccount(creditAccount);
        creditAccount.setUser(user);

        return creditAccount;
    }
}
