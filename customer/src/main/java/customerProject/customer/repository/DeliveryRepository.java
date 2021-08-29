package customerProject.customer.repository;

import customerProject.customer.domain.Delivery;
import customerProject.customer.dto.historyDto.DeliveryHistoryResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

    //배송 테이블 기준으로 주문 테이블 조인
    @Query("SELECT new customerProject.customer.dto.historyDto.DeliveryHistoryResponse(d.no, o.no, o.date, d.deliveryStatus) FROM Delivery d JOIN d.orders o")
    List<DeliveryHistoryResponse> findDeliveryHistoryList();

}
