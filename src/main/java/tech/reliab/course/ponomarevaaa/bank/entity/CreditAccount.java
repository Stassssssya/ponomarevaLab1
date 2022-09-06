package tech.reliab.course.ponomarevaaa.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class CreditAccount {

    private Long id;
    private User user; //Пользователь, за которым закреплен этот кредитный счет
    private String bankName; //Название банка, где взят кредит
    private Date startDate; //Дата начала кредита
    private Date endDate; //Дата окончания кредита
    private Integer monthCount; //Кол-во месяцев, на которые взят кредит
    private Double creditAmount; //Сумма кредита
    private Double monthlyPayment; //Ежемесячный платеж
    private Double interestRate; //Процентная ставка
    private Employee employee; //Сотрудник, который выдал кредит
    private PaymentAccount paymentAccount; //Платежный счет в банке с которого будет осуществляться погашение данного кредита
}
