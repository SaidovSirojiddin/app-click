package ai.ecma.appclick.repository;

import ai.ecma.appclick.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    Optional<Payment> findFirstByOrderTransactionIdOrderByPayDateDesc(Long orderTransactionId);


}
