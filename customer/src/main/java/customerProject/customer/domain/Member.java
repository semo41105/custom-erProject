package customerProject.customer.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue @Column(name = "member_no")
    private Long no;
    private String id;
    private String pw;
    private String name;
    private String phone;
    private String email;
    private String city;
    private String street;
    private String zipcode;


}
