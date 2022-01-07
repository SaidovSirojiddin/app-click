package ai.ecma.appclick.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * CLICKDAN KELGAN CLICK PREPARE OBJECTNI SAQLASH UCHUN
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "prepare_object")
public class ClickObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //ID платежа в системе CLICK
    private Integer clickTransId;

    //ID сервиса
    private Integer serviceId;

    //Номер платежа в системе CLICK. Отображается в СМС у клиента при оплате.
    private Integer clickPaydocId;

    //ID заказа(для Интернет магазинов)/лицевого счета/логина в биллинге поставщика  - varchar
    private String merchantTransId;

    //float	Сумма оплаты (в сумах)
    private float amount;

    //Код статуса завершения платежа. 0 – успешно. В случае ошибки возвращается код ошибки.
    private Integer error;

    //Описание кода завершения платежа.
    private String errorNote;

    private boolean cancelled;
}
