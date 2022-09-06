package tech.reliab.course.ponomarevaaa.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {

    private Long id;
    private String name;
    private Integer officeCount = 0; //Кол-во офисов
    private Integer bankAtmCount = 0; //Кол-во банкоматов
    private Integer employeeCount = 0; //Кол-во сотрудников
    private Integer userCount = 0; //Кол-во клиентов
    private Integer rating; //Рейтинг банка
    private Integer totalAmount; //Всего денег в банке
    private Integer interestRate; //Процентная ставка
}
