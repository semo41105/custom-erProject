package customerProject.customer.service.myPage;


import customerProject.customer.domain.Delivery;
import customerProject.customer.domain.Orders;
import customerProject.customer.domain.OrdersProduct;
import customerProject.customer.domain.product.Product;
import customerProject.customer.dto.UserDto;
import customerProject.customer.dto.historyDto.OrderHistoryResponse;
import customerProject.customer.repository.DeliveryRepository;
import customerProject.customer.repository.OrdersProductRepository;
import customerProject.customer.repository.OrdersRepository;
import customerProject.customer.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderHistoryService {

    private final OrdersRepository ordersRepository;
    private final OrdersProductRepository ordersProductRepository;
    private final ProductRepository productRepository;
    private final DeliveryRepository deliveryRepository;


    //주문내역 조회해오기 (여러 엔티티 연관관계 매핑하여)
    public List<OrderHistoryResponse> getOrderHistory(UserDto loginUser) {
        List<Orders> orders = ordersRepository.findAllByMemberNo(loginUser.getNo());
        return createOrderHistoryList(orders);
    }

    //주문내역 리스트 생성
    private List<OrderHistoryResponse> createOrderHistoryList(List<Orders> orders) {
        List<OrderHistoryResponse> orderHistoryResponseList = new ArrayList<>();

        for (int i = 0; i < orders.size(); i ++){
            OrdersProduct ordersProduct = ordersProductRepository.findByOrdersNo(orders.get(i).getNo());
            Optional<Product> productOptional = productRepository.findById(ordersProduct.getProduct().getNo());
            Product product = productOptional.get();
            Delivery delivery = deliveryRepository.findByOrdersNo(orders.get(i).getNo());

            OrderHistoryResponse orderHistoryResponse = OrderHistoryResponse.builder()
                    .orderNo(orders.get(i).getNo())
                    .orderDate(orders.get(i).getDate())
                    .orderStatus(orders.get(i).getStatus())
                    .orderCount(ordersProduct.getOrderCount())
                    .orderPrice(ordersProduct.getOrderPrice())
                    .customImg(ordersProduct.getImg())
                    .productName(product.getName())
                    .productPrice(product.getPrice())
                    .deliveryStatus(delivery.getDeliveryStatus())
                    .build();

            orderHistoryResponseList.add(orderHistoryResponse);
        }

        return orderHistoryResponseList;
    }




}
