package com.cheapshop.cheapshop.domain.repository;


import com.cheapshop.cheapshop.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByUserId(long id);
    public Optional<User> findByEmail(String Email);
}
