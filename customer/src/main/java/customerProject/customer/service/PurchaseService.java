package customerProject.customer.service;

import customerProject.customer.domain.Delivery;
import customerProject.customer.domain.Member;
import customerProject.customer.domain.Orders;
import customerProject.customer.domain.OrdersProduct;
import customerProject.customer.domain.product.Product;
import customerProject.customer.dto.ShippingDto;
import customerProject.customer.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final OrdersRepository ordersRepository;
    private final OrdersProductRepository ordersProductRepository;
    private final DeliveryRepository deliveryRepository;
    private final MemberRepository memberRepository;
    private final ProductRepository productRepository;

    @Transactional
    public int newOrder(ShippingDto dto){
        //총 가격 입력
        int totalPrice = dto.getProductPrice() * dto.getProductQuantity();
        dto.setTotalPrice(totalPrice);

        Member member = memberRepository.findByNo(dto.getNo());
        Orders ordersResult = ordersRepository.save(dto.toOrdersEntity(member));

        Product product = productRepository.findByPno(dto.getPNo());
        OrdersProduct ordersProductResult = ordersProductRepository.save(dto.toOrdersProductEntity(ordersResult, product));

        Delivery deliveryResult = deliveryRepository.save(dto.toDeliveryEntity(ordersResult));

        return (ordersResult != null && ordersProductResult != null && deliveryResult != null ?
                1 :
                0 );
    }

}
