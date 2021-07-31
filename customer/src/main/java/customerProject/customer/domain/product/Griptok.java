package customerProject.customer.domain.product;

import customerProject.customer.domain.enums.GripType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Entity
@DiscriminatorValue("G")
@Getter
@Setter
public class Griptok extends Product{

    @Enumerated(EnumType.STRING)
    private GripType gripType;

}
