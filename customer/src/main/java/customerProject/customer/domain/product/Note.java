package customerProject.customer.domain.product;

import customerProject.customer.domain.enums.NoteType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@DiscriminatorValue("N")
@Getter
@Setter
public class Note extends Product{

    @Enumerated(EnumType.STRING)
    private NoteType noteType;

}
