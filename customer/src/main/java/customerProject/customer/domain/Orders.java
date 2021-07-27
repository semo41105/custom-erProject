package customerProject.customer.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Getter @Setter
public class Orders {

    @Id @GeneratedValue @Column(name = "orders_no")
    private Long no;
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "member_no")
    private Member member;
    private LocalDateTime date;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

}
