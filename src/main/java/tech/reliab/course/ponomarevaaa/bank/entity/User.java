package tech.reliab.course.ponomarevaaa.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String fullName;
    private LocalDate dateOfBirth; //Дата рождения
    private String placeOfWork; //Место работы
    private Integer salary; //Ежемесячный доход
    private Bank bank; //Банки, которыми он пользуется
    private CreditAccount creditAccount; //Кредитные счета
    private PaymentAccount paymentAccount; //Платежные счета
    private Integer ratingForBank; //Кредитный рейтинг для банка
}
