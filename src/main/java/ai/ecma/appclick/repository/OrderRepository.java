package ai.ecma.appclick.repository;

import ai.ecma.appclick.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
