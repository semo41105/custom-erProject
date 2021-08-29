package customerProject.customer.controller.myPage;

import customerProject.customer.dto.UserDto;
import customerProject.customer.dto.historyDto.OrderHistoryResponse;
import customerProject.customer.service.myPage.OrderHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OrderHistoryController {

    private final OrderHistoryService orderHistoryService;


    @GetMapping("/orderHistory")
    public String orderHistory(Model model, @SessionAttribute("loginUser")UserDto loginUser) {
        List<OrderHistoryResponse> orderHistoryResponseList = orderHistoryService.getOrderHistory(loginUser);
        model.addAttribute("orderHistoryResponseList", orderHistoryResponseList);
        return "myPage/orderHistory";
    }


}
