package customerProject.customer.dto;

import customerProject.customer.domain.enums.TSize;
import customerProject.customer.domain.enums.TType;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@ToString
public class ProductRequest {

    private String name;
    private String img;
    private int quantity;
    private TSize size;
    private TType type;

    @Builder
    public ProductRequest(String name, String img, int quantity, TSize size, TType type) {
        this.name = name;
        this.img = img;
        this.quantity = quantity;
        this.size = size;
        this.type = type;
    }
}
