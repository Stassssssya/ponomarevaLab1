package tech.reliab.course.ponomarevaaa.bank.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BanKOfficeStatusEnum {
    WORK ("Работает"),
    NOT_WORK ("Не работает");

    private String status;
}
