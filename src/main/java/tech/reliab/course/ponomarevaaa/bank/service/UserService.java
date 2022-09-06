package tech.reliab.course.ponomarevaaa.bank.service;

import tech.reliab.course.ponomarevaaa.bank.entity.User;

public interface UserService {

    User get();

    void add(User user);

    void update(User user);

    void delete();
}
