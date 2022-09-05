package tech.reliab.course.ponomarevaaa.bank.entity;

import java.util.Date;
import java.util.List;

public class User {

    private Long id;
    private String fullName;
    private Date dateOfBirth; //Дата рождения
    private String placeOfWork; //Место работы
    private Double monthlyIncome; //Ежемесячный доход
    private List<Bank> banks; //Банки, которыми он пользуется
    private List<CreditAccount> creditAccounts; //Кредитные счета
    private List<PaymentAccount> paymentAccounts; //Платежные счета
    private Long ratingForBank; //Кредитный рейтинг для банка
}
