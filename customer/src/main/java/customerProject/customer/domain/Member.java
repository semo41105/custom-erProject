package customerProject.customer.domain;

import lombok.*;

import javax.persistence.*;


@Entity
@Getter @Setter
@Builder
@NoArgsConstructor //기본생성자를 의미
@AllArgsConstructor  //전체 매개변수 생성자를 의미
@Table(name = "MEMBER", uniqueConstraints = {@UniqueConstraint(
        name = "ID_PHONE_EMAIL_UNIQUE", columnNames = {"id", "phone", "email"} )})
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
