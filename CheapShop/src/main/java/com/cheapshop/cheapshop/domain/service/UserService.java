package com.cheapshop.cheapshop.domain.service;

import com.cheapshop.cheapshop.domain.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface UserService {
    Page<User> getAllUsers(Pageable pageable);

    User createUser(User user);
    User updateUser(Long userId, User userRequest);

    ResponseEntity<?> deleteUser(Long userId);

    User getUserById(Long userId);
    User getUserByEmail(String email);
}
