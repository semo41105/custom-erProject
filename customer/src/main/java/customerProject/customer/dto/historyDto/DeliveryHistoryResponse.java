package customerProject.customer.dto.historyDto;

import customerProject.customer.domain.enums.DeliveryStatus;
import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
public class DeliveryHistoryResponse {

    private Long deliveryNo;
    private Long orderNo;
    private Long memberNo;
    private LocalDateTime orderDate;
    private DeliveryStatus deliveryStatus;

    public DeliveryHistoryResponse(Long deliveryNo, Long orderNo, Long memberNo, LocalDateTime orderDate, DeliveryStatus deliveryStatus) {
        this.deliveryNo = deliveryNo;
        this.orderNo = orderNo;
        this.memberNo = memberNo;
        this.orderDate = orderDate;
        this.deliveryStatus = deliveryStatus;
    }
}
