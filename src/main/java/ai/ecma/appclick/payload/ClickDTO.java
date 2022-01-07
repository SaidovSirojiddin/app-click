package ai.ecma.appclick.payload;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * CLICKDAN KELGAN CLICK PREPARE OBJECTNI SAQLASH UCHUN
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClickDTO {

    //ID платежа в системе CLICK
    @JsonProperty(value = "click_trans_id")
    private Integer clickTransId;

    //ID сервиса
    @JsonProperty(value = "service_id")
    private Integer serviceId;

    //Номер платежа в системе CLICK. Отображается в СМС у клиента при оплате.
    @JsonProperty(value = "click_paydoc_id")
    private Integer clickPaydocId;

    //ID заказа(для Интернет магазинов)/лицевого счета/логина в биллинге поставщика  - varchar
    @JsonProperty(value = "merchant_trans_id")
    private String merchantTransId;

    //ID платежа в биллинг системе поставщика для подтверждения
    @JsonProperty(value = "merchant_prepare_id")
    private Long merchantPrepareId;

    //ID платежа в биллинг системе поставщика для подтверждения
    @JsonProperty(value = "merchant_confirm_id")
    private Long merchantConfirmId;

    //float	Сумма оплаты (в сумах)
    @JsonProperty(value = "amount")
    private float amount;

    //Выполняемое действие. Для Prepare — 0
    @JsonProperty(value = "action")
    private Integer action;

    //Код статуса завершения платежа. 0 – успешно. В случае ошибки возвращается код ошибки.
    @JsonProperty(value = "error")
    private Integer error;

    //Описание кода завершения платежа.
    @JsonProperty(value = "error_note")
    private String errorNote;

    //Дата платежа. Формат «YYYY-MM-DD HH:mm:ss»
    @JsonProperty(value = "sign_time")
    private String signTime;

    //Проверочная строка, подтверждающая подлинность отправляемого запроса. ХЭШ MD5 из следующих параметров:
    //md5( click_trans_id + service_id + SECRET_KEY* + merchant_trans_id + amount + action + sign_time)
    //SECRET_KEY – уникальная строка, выдаваемая Поставщику при подключении.
    @JsonProperty(value = "sign_string")
    private String signString;
}
