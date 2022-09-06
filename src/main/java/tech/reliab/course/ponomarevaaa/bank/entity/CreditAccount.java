package tech.reliab.course.ponomarevaaa.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditAccount {

    private Long id;
    private User user; //Пользователь, за которым закреплен этот кредитный счет
    private String bankName; //Название банка, где взят кредит
    private LocalDate startDate; //Дата начала кредита
    private LocalDate endDate; //Дата окончания кредита
    private Integer monthCount; //Кол-во месяцев, на которые взят кредит
    private Integer creditAmount; //Сумма кредита
    private Integer monthlyPayment; //Ежемесячный платеж
    private Integer interestRate; //Процентная ставка
    private Employee employee; //Сотрудник, который выдал кредит
    private PaymentAccount paymentAccount; //Платежный счет в банке с которого будет осуществляться погашение данного кредита
}
