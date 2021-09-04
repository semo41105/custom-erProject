package customerProject.customer.controller.myPage;

import customerProject.customer.dto.UserDto;
import customerProject.customer.dto.historyDto.OrderHistoryResponse;
import customerProject.customer.dto.historyDto.OrderNoRequest;
import customerProject.customer.service.myPage.OrderHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @ResponseBody
    @PatchMapping(value = "/orderCancel", consumes = "application/json", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> orderCancel(@RequestBody OrderNoRequest orderNoRequest) {
        orderHistoryService.orderCancel(orderNoRequest.getOrderNo());
        return new ResponseEntity<>("orderCancel 성공", HttpStatus.OK);
    }


}
