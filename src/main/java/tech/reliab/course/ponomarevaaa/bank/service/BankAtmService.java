package tech.reliab.course.ponomarevaaa.bank.service;

import tech.reliab.course.ponomarevaaa.bank.entity.BankAtm;

public interface BankAtmService {

    BankAtm get();

    void add(BankAtm bankAtm);

    void update(BankAtm bankAtm);

    void delete();
}
