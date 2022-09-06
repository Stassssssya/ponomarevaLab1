package tech.reliab.course.ponomarevaaa.bank.service.impl;

import tech.reliab.course.ponomarevaaa.bank.entity.User;
import tech.reliab.course.ponomarevaaa.bank.service.UserService;

public class UserServiceImpl implements UserService {

    private User user;

    /**
     * Метод для получения клиента
     * @author PonomarevaAA
     */
    @Override
    public User get() {
        return user;
    }

    /**
     * Метод для добавления клиента
     * @author PonomarevaAA
     */
    @Override
    public void add(User user) {
        this.user = user;
    }

    /**
     * Метод для обновления клиента
     * @author PonomarevaAA
     */
    @Override
    public void update(User user) {
        this.user.setFullName(user.getFullName());
        this.user.setDateOfBirth(user.getDateOfBirth());
        this.user.setPlaceOfWork(user.getPlaceOfWork());
        this.user.setSalary(user.getSalary());
        this.user.setBank(user.getBank());
        this.user.setCreditAccount(user.getCreditAccount());
        this.user.setPaymentAccount(user.getPaymentAccount());
        this.user.setRatingForBank(user.getRatingForBank());
    }

    /**
     * Метод для удаления клиента
     * @author PonomarevaAA
     */
    @Override
    public void delete() {
        this.user = null;
    }
}
