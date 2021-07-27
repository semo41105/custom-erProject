package customerProject.customer.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Orders_Product {

    @Id @GeneratedValue @Column(name = "orders_product_no")
    private Long no;
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "orders_no")
    private Orders orders;
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "product_no")
    private Product product;

    private int orderCount;
    private int orderPrice;

    private String img;

}
