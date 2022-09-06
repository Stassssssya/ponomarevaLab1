package tech.reliab.course.ponomarevaaa.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.reliab.course.ponomarevaaa.bank.enums.BankAtmStatusEnum;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAtm {

    private Long id;
    private String name;
    private String address; //Адрес
    private BankAtmStatusEnum status; //Статус
    private Bank bank; //Банк, которому принадлежит банкомат
    private String location; //Расположение банкомата
    private Employee maintenanceEmployee; //Обслуживающий сотрудник
    private Boolean isPaymentOfMoney; //Работает ли на выдачу денег?
    private Boolean isDepositingMoney; //Можно ли внести деньги?
    private Integer amount; //Кол-во денег в банкомате
    private Integer maintenanceCost; //Стоимость обслуживания банкомата
}
