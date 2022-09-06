package tech.reliab.course.ponomarevaaa.bank.service;

import tech.reliab.course.ponomarevaaa.bank.entity.BankAtm;

public interface AtmService {

    BankAtm get();

    void add(BankAtm bankAtm);

    void update(BankAtm bankAtm);

    void delete();
}
