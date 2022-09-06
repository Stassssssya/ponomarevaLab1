package tech.reliab.course.ponomarevaaa.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentAccount {

    private Long id;
    private User user; //Пользователь, за которым закреплен этот платежный счет
    private String bankName; //Название банка, в котором открыт этот счет
    private Integer amount = 0; //Сумма, которая лежит в данный момент на счету
}
