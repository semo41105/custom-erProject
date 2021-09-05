package customerProject.customer.dto.historyDto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class OrderNoRequest {

    private Long orderNo;


    public OrderNoRequest(Long orderNo) {
        this.orderNo = orderNo;
    }
}
