package customerProject.customer.domain.product;

import customerProject.customer.domain.enums.StickerShape;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("S")
@Getter
@Setter
public class Sticker extends Product{

    @Enumerated(EnumType.STRING)
    private StickerShape stickerShape;

}
