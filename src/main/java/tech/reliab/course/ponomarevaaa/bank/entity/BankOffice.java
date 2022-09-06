package tech.reliab.course.ponomarevaaa.bank.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.reliab.course.ponomarevaaa.bank.enums.BanKOfficeStatusEnum;
import tech.reliab.course.ponomarevaaa.bank.enums.BankAtmStatusEnum;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankOffice {

    private Long id;
    private String name;
    private String address; //Адрес банковского офиса
    private BanKOfficeStatusEnum status; //Статус
    private Boolean isPlacementOfBankAtm; //Можно ли разместить банкомат?
    private Integer bankAtmCount; //Кол-во банкоматов в данном офисе
    private Boolean isLoanProcessing; //Можно ли оформить кредит в данном офисе?
    private Boolean isPaymentOfMoney; //Работает ли на выдачу денег?
    private Boolean isDepositingMoney; //Можно ли внести деньги?
    private Integer amount; //Кол-во денег в банковском офисе
    private Integer costOfRenting; //Стоимость аренды банковского офиса
}
