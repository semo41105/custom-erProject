package customerProject.customer.repository;

import customerProject.customer.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Long> {

    List<Orders> findAllByMemberNo(Long no);

}
