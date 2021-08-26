package customerProject.customer.dto;

import customerProject.customer.domain.enums.TSize;
import customerProject.customer.domain.enums.TType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ShippingDto {

    private int orderNum;
    private String orderDate;
    private String orderStatus;
    private String shippingStatus;

    private String id;
    private String name;
    private String phone;
    private String city;
    private String street;
    private String zipcode;

    private String productName;
    private int productQuantity;
    private TType productType;
    private TSize productSize;

    private int totalPrice;

}
