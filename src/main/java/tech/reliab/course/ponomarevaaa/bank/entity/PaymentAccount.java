package tech.reliab.course.ponomarevaaa.bank.entity;

public class PaymentAccount {

    private Long id;
    private User user; //Пользователь, за которым закреплен этот платежный счет
    private Bank bank; //Название банка, в котором открыт этот счет
    private Double amount = 0.0; //Сумма, которая лежит в данный момент на счету
}
