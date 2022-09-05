package tech.reliab.course.ponomarevaaa.bank.entity;

import lombok.Data;

@Data
public class Bank {

    private Long id;
    private String name;
    private Integer officeCount = 0; //Кол-во офисов
    private Integer bankAtmCount = 0; //Кол-во банкоматов
    private Integer employeeCount = 0; //Кол-во сотрудников
    private Integer userCount = 0; //Кол-во клиентов
    private Double rating; //Рейтинг банка
    private Double totalAmount; //Всего денег в банке
    private Double interestRate; //Процентная ставка
}
