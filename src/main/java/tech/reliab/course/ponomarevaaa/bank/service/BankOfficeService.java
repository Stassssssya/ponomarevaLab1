package tech.reliab.course.ponomarevaaa.bank.service;

import tech.reliab.course.ponomarevaaa.bank.entity.BankOffice;

public interface BankOfficeService {

    BankOffice get();

    void add(BankOffice bankOffice);

    void update(BankOffice bankOffice);

    void delete();
}
