package customerProject.customer.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Product {

    @Id @GeneratedValue @Column(name = "product_no")
    private Long no;
    private String name;
    private int price;
    private int quantity;

    @Enumerated(EnumType.STRING)
    private NoteType noteType;
    @Enumerated(EnumType.STRING)
    private StickerShape stickerShape;
    @Enumerated(EnumType.STRING)
    private GripType gripType;
    @Enumerated(EnumType.STRING)
    private CupType cupType;
    private int tSize;
    @Enumerated(EnumType.STRING)
    private TType tType;


}
