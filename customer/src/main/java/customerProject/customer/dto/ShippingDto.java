package customerProject.customer.dto;

import customerProject.customer.domain.*;
import customerProject.customer.domain.enums.DeliveryStatus;
import customerProject.customer.domain.enums.OrderStatus;
import customerProject.customer.domain.enums.TSize;
import customerProject.customer.domain.enums.TType;
import customerProject.customer.domain.product.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
public class ShippingDto {

    private int orderNum;
    private String orderDate;
    private String orderStatus;
    private String shippingStatus;

    private Long no;
    private String name;
    private String phone;
    private String city;
    private String street;
    private String zipcode;

    private Long pNo;
    private String productName;
    private int productQuantity;
    private TType productType;
    private TSize productSize;
    private int productPrice;

    private int totalPrice;

    @Builder
    public ShippingDto(int orderNum, String orderDate, String orderStatus, String shippingStatus, Long no, String name, String phone, String city, String street, String zipcode, String productName, int productQuantity, TType productType, TSize productSize, int productPrice, int totalPrice, Long pNo) {
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.shippingStatus = shippingStatus;
        this.no = no;
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productType = productType;
        this.productSize = productSize;
        this.productPrice = productPrice;
        this.totalPrice = totalPrice;
        this.pNo = pNo;
    }

    //주문, 주문_상품, 배송
    public Orders toOrdersEntity(Member member){
        return  Orders.builder()
                .member(member)
                .date(LocalDateTime.now())
                .status(OrderStatus.ORDER)
                .build();
    }

    public OrdersProduct toOrdersProductEntity(Orders orders, Product product){

        return OrdersProduct.builder()
                .orders(orders)
                .product(product)
                .orderCount(productQuantity)
                .orderPrice(totalPrice)
                .build();
    }

    public Delivery toDeliveryEntity(Orders orders){
        Address address = new Address(city, street, zipcode);
        return Delivery.builder()
                .orders(orders)
                .deliveryStatus(DeliveryStatus.READY)
                .address(address)
                .build();
    }
}
