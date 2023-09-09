package ru.practicum.shareit.user.repo;

import ru.practicum.shareit.user.model.User;

import java.util.List;

public interface UserRepository {

    Boolean checkEmailDuplicate(String email);

    Boolean checkId(Long id);

    List<User> findAll();

    User findById(Long userId);

    User save(User user);

    User update(User user);

    void deleteAll();

    void deleteById(Long userId);
}
