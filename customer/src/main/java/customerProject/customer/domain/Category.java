package customerProject.customer.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Category {

    @Id @GeneratedValue @Column(name = "category_no")
    private Long no;
    private String name;

}
