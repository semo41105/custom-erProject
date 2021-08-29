package customerProject.customer.controller.myPage;

import customerProject.customer.service.myPage.OrderHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class OrderHistoryController {

    private final OrderHistoryService orderHistoryService;


    @GetMapping("/orderHistory")
    public String orderHistory(Model model) {
        orderHistoryService.getOrderHistory();
        return "myPage/orderHistory";
    }


}
