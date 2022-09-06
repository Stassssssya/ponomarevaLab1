package tech.reliab.course.ponomarevaaa.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class User {

    private Long id;
    private String fullName;
    private Date dateOfBirth; //Дата рождения
    private String placeOfWork; //Место работы
    private Double monthlyIncome; //Ежемесячный доход
    private Bank bank; //Банки, которыми он пользуется
    private CreditAccount creditAccount; //Кредитные счета
    private PaymentAccount paymentAccount; //Платежные счета
    private Long ratingForBank; //Кредитный рейтинг для банка
}
