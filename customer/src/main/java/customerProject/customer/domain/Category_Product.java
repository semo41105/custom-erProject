package customerProject.customer.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Category_Product {

    @Id @GeneratedValue @Column(name = "category_product_no")
    private Long no;
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "category_no")
    private Category category;
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "product_no")
    private Product product;

}
