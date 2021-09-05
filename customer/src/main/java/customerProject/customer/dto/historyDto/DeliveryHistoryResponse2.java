package customerProject.customer.dto.historyDto;

import customerProject.customer.domain.Address;
import customerProject.customer.domain.enums.DeliveryStatus;
import customerProject.customer.domain.enums.OrderStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
public class DeliveryHistoryResponse2 {

    private Long deliveryNo;
    private Long orderNo;
    private LocalDateTime orderDate;
    private DeliveryStatus deliveryStatus;
    private OrderStatus orderStatus;

    private Address address;

    public DeliveryHistoryResponse2(Long deliveryNo, Long orderNo, LocalDateTime orderDate, DeliveryStatus deliveryStatus, OrderStatus orderStatus, Address address) {
        this.deliveryNo = deliveryNo;
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.deliveryStatus = deliveryStatus;
        this.orderStatus = orderStatus;
        this.address = address;
    }
}