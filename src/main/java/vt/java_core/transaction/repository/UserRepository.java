package vt.java_core.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vt.java_core.transaction.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
