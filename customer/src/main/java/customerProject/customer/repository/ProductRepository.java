package customerProject.customer.repository;

import customerProject.customer.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

//    Product findByProductNo(Long no);

}
