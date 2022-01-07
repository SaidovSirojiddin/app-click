package ai.ecma.appclick.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class OrderTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //PAYME TOMONIDAN BERILADIGAN ID
    private String transactionId;

    private Timestamp transactionCreationTime;

    private Timestamp performTime;

    private Timestamp cancelTime;

    private Integer reason;

    private Integer state;

    @JoinColumn(insertable = false, updatable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private Order order;

    @Column(name = "order_id", nullable = false)
    private Long orderId;

    public OrderTransaction(String transactionId, Timestamp transactionCreationTime, Integer state, Long orderId) {
        this.transactionId = transactionId;
        this.transactionCreationTime = transactionCreationTime;
        this.state = state;
        this.orderId = orderId;
    }
}
