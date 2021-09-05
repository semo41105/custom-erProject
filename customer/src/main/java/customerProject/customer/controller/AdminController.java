package customerProject.customer.controller;

import customerProject.customer.dto.historyDto.DeliveryHistoryResponse;
import customerProject.customer.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping("/admin")
    public String adminOrder() {
        return "admin/adminOrder";
    }

    @GetMapping("/admin/adminDelivery")
    public String adminDelivery(Model model) {
        List<DeliveryHistoryResponse> deliveryHistoryList = deliveryService.findDeliveryHistoryAll();
        model.addAttribute("deliverys",deliveryHistoryList);
        return "admin/adminDelivery";
    }

}
