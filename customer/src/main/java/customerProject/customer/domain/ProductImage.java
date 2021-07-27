package customerProject.customer.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.lang.reflect.Method;

@Entity
@Getter @Setter
public class ProductImage {

    @Id @GeneratedValue
    private Long no;
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "product_no")
    private Product product;

    private String img;

}
