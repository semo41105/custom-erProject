package customerProject.customer.domain.product;

import customerProject.customer.domain.enums.TSize;
import customerProject.customer.domain.enums.TType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("T")
@Getter
@Setter
public class Tshirts extends Product{

    @Enumerated(EnumType.STRING)
    private TType tType;

    @Enumerated(EnumType.STRING)
    private TSize tSize;

}
