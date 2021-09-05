package customerProject.customer.service;

import customerProject.customer.domain.Delivery;
import customerProject.customer.domain.enums.DeliveryStatus;
import customerProject.customer.dto.historyDto.DeliveryHistoryResponse;
import customerProject.customer.repository.DeliveryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;

    @Transactional
    public List<DeliveryHistoryResponse> findDeliveryHistoryAll(){
        return deliveryRepository.findDeliveryHistoryList();
    }

    @
    Transactional
    public void deliveryUpdate(Long deliveryNo){
        Delivery delivery = deliveryRepository.findById(deliveryNo).orElseThrow(
                () -> new IllegalArgumentException("배송 상태 수정 실패")
        );
        delivery.setDeliveryStatus(DeliveryStatus.COMPLETE);

        deliveryRepository.save(delivery);
    }

}
