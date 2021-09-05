package customerProject.customer.domain;

import customerProject.customer.domain.enums.DeliveryStatus;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "d_no")
    private Long no;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "o_no")
    private Orders orders;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus;

    @Embedded
    private Address address;

}
