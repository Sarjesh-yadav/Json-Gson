package in.sarjesh.__JSON_GSON_App;

import lombok.Data;

@Data
public class Order {

    private Integer orderId;
    private String orderedBy;
    private String orderStatus;
    private Double orderAmount;
}
