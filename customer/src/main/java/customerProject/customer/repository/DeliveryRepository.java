package customerProject.customer.repository;

import customerProject.customer.domain.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

    Delivery findByOrdersNo(Long no);
}
