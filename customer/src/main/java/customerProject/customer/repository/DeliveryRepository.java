package customerProject.customer.repository;

import customerProject.customer.domain.Delivery;
import customerProject.customer.dto.historyDto.DeliveryHistoryResponse;
import customerProject.customer.dto.historyDto.DeliveryHistoryResponse2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {


    Delivery findByOrdersNo(Long no);

    @Query("SELECT new customerProject.customer.dto.historyDto.DeliveryHistoryResponse(d.no, o.no, o.date, d.deliveryStatus) FROM Delivery d JOIN d.orders o")
    List<DeliveryHistoryResponse> findDeliveryHistoryList();

    @Query("SELECT new customerProject.customer.dto.historyDto.DeliveryHistoryResponse2(d.no, o.no, o.date, d.deliveryStatus, o.status, d.city, d.street, d.zipcode) FROM Delivery d JOIN d.orders o")
    List<DeliveryHistoryResponse2> findDeliveryHistoryList2();


}
