package tech.reliab.course.ponomarevaaa.bank.service;

import tech.reliab.course.ponomarevaaa.bank.entity.Employee;

public interface EmployeeService {

    Employee get();

    void add(Employee employee);

    void update(Employee employee);

    void delete();
}
