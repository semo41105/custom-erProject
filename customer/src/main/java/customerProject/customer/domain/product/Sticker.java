package customerProject.customer.domain.product;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("S")
@Getter
@Setter
public class Sticker extends Product{
    int price = 2000;
}
