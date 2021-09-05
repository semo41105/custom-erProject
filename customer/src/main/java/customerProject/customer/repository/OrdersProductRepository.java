package customerProject.customer.repository;

import customerProject.customer.domain.OrdersProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersProductRepository extends JpaRepository<OrdersProduct, Long> {

    OrdersProduct findByOrdersNo(Long no);
}
