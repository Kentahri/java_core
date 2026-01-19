package vt.java_core.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vt.java_core.transaction.entity.TransactionLog;

public interface TransactionLogRepository extends JpaRepository<TransactionLog, Long> {
}
