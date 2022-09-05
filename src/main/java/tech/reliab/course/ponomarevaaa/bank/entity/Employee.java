package tech.reliab.course.ponomarevaaa.bank.entity;

import java.util.Date;

public class Employee {

    private Long id;
    private String fullName;
    private Date dateOfBirth; //Дата рождения
    private String jobTitle; //Должность
    private Bank bank; //В каком банке работает
    private Boolean isDistantWork; //Работает ли в банковском офисе или удаленно?
    private BankOffice bankOffice; //Банковский офис, в котором работает
    private Boolean isIssuanceOfCredit; //Может ли выдавать кредиты?
    private Double salary; //Размер зарплаты
}
