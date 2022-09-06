package tech.reliab.course.ponomarevaaa.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BankAtm {

    private Long id;
    private String name;
    private String address; //Адрес
    private String status; //Статус
    private Bank bank; //Банк, которому принадлежит банкомат
    private String location; //Расположение банкомата
    private Employee maintenanceEmployee; //Обслуживающий сотрудник
    private Boolean isPaymentOfMoney; //Работает ли на выдачу денег?
    private Boolean isDepositingMoney; //Можно ли внести деньги?
    private Double amount; //Кол-во денег в банкомате
    private Double maintenanceCost; //Стоимость обслуживания банкомата
}
