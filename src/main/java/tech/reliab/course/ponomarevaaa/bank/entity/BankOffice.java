package tech.reliab.course.ponomarevaaa.bank.entity;

public class BankOffice {

    private Long id;
    private String name;
    private String address; //Адрес банковского офиса
    private String status; //Статус
    private Boolean isPlacementOfBankAtm; //Можно ли разместить банкомат?
    private Integer bankAtmCount; //Кол-во банкоматов в данном офисе
    private Boolean isLoanProcessing; //Можно ли оформить кредит в данном офисе?
    private Boolean isPaymentOfMoney; //Работает ли на выдачу денег?
    private Boolean isDepositingMoney; //Можно ли внести деньги?
    private Double amount; //Кол-во денег в банковском офисе
    private Double costOfRenting; //Стоимость аренды банковского офиса
}
