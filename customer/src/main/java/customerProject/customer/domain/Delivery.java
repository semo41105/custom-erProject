package customerProject.customer.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    private Long no;
    @OneToOne(fetch = FetchType.LAZY) @JoinColumn(name = "orders_no")
    private Orders orders;
    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus;

    private String city;
    private String street;
    private String zipcode;

}
