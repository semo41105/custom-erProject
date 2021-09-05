package customerProject.customer.dto.historyDto;

import customerProject.customer.domain.enums.DeliveryStatus;
import customerProject.customer.domain.enums.OrderStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class OrderHistoryResponse {

    private Long orderNo;
    private Long orderDate;
    private String productName;
    private String customImg;
    private int productPrice;
    private int orderCount;
    private int orderPrice;
    private OrderStatus orderStatus;
    private DeliveryStatus deliveryStatus;


    @Builder
    public OrderHistoryResponse(Long orderNo, Long orderDate, String productName, String customImg, int productPrice, int orderCount, int orderPrice, OrderStatus orderStatus, DeliveryStatus deliveryStatus) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.productName = productName;
        this.customImg = customImg;
        this.productPrice = productPrice;
        this.orderCount = orderCount;
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
        this.deliveryStatus = deliveryStatus;
    }

}
