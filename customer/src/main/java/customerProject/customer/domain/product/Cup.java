package customerProject.customer.domain.product;

import customerProject.customer.domain.enums.CupType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("C")
@Getter
@Setter
public class Cup extends Product{

    @Enumerated(EnumType.STRING)
    private CupType cupType;

}
