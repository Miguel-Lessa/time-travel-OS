package com.ttos.ttos.shared.repository;

import java.util.Optional;
import com.ttos.ttos.shared.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Optional<User>  findById(Long id);

    User save(User user);

    void deleteById(Long id);
}
