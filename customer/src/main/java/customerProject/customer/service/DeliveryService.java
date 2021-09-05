package customerProject.customer.service;

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


}
