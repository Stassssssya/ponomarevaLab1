package tech.reliab.course.ponomarevaaa.bank.service.impl;

import tech.reliab.course.ponomarevaaa.bank.entity.Employee;
import tech.reliab.course.ponomarevaaa.bank.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

    private Employee employee;

    /**
     * Метод для получения сотрудника
     * @author PonomarevaAA
     */
    @Override
    public Employee get() {
        return employee;
    }

    /**
     * Метод для добавления сотрудника
     * @author PonomarevaAA
     */
    @Override
    public void add(Employee employee) {
        this.employee = employee;
    }

    /**
     * Метод для обновления сотрудника
     * @author PonomarevaAA
     */
    @Override
    public void update(Employee employee) {
        this.employee.setFullName(employee.getFullName());
        this.employee.setDateOfBirth(employee.getDateOfBirth());
        this.employee.setJobTitle(employee.getJobTitle());
        this.employee.setBank(employee.getBank());
        this.employee.setIsDistantWork(employee.getIsDistantWork());
        this.employee.setBankOffice(employee.getBankOffice());
        this.employee.setIsIssuanceOfCredit(employee.getIsIssuanceOfCredit());
        this.employee.setSalary(employee.getSalary());

    }

    /**
     * Метод для удаления сотрудника
     * @author PonomarevaAA
     */
    @Override
    public void delete() {
        this.employee = null;
    }
}
