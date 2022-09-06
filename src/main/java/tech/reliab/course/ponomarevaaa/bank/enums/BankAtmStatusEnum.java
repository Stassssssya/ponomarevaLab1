package tech.reliab.course.ponomarevaaa.bank.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BankAtmStatusEnum {
    WORK ("Работает"),
    NOT_WORK ("Не работает"),
    NO_MONEY ("Нет денег");

    private String status;
}
