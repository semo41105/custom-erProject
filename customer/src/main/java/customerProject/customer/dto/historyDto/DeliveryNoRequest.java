package customerProject.customer.dto.historyDto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class DeliveryNoRequest {

    private Long deliveryNo;

    public DeliveryNoRequest(Long deliveryNo) {
        this.deliveryNo = deliveryNo;
    }
}
