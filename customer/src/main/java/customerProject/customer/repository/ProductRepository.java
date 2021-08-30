package customerProject.customer.repository;

import customerProject.customer.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select p from Product p where p.no = :pNo")
    Product findByPno(@Param("pNo")Long pNo);
}
