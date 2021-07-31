package customerProject.customer.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter @Setter
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_no")
    private Long no;

    private String id;

    private String pw;

    private String name;

    private String phone;

    private String email;

    @Embedded
    private Address address;


}
