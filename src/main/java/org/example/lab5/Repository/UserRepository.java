package org.example.lab5.Repository;

import org.example.lab5.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
public Optional<User> findByLogin(String login);
}
