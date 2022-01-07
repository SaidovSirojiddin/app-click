package ai.ecma.appclick.repository;

import ai.ecma.appclick.entity.OrderTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

public interface OrderTransactionRepository extends JpaRepository<OrderTransaction, Long> {

    Optional<OrderTransaction> findByTransactionId(String transactionId);

    List<OrderTransaction> findAllByStateAndTransactionCreationTimeBetween(Integer state, Timestamp fromTransactionCreationTime, Timestamp toTransactionCreationTime);
}
