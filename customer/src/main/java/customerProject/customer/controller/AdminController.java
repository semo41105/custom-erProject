package customerProject.customer.controller;

import customerProject.customer.dto.historyDto.DeliveryHistoryResponse;
import customerProject.customer.dto.historyDto.DeliveryNoRequest;
import customerProject.customer.dto.historyDto.OrderNoRequest;
import customerProject.customer.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping("/admin")
    public String adminOrder(Model model) {
        List<DeliveryHistoryResponse> deliveryHistoryList = deliveryService.findDeliveryHistoryAll();
        model.addAttribute("deliverys",deliveryHistoryList);
        return "admin/adminOrder";
    }

    @GetMapping("/admin/adminDelivery")
    public String adminDelivery(Model model) {
        List<DeliveryHistoryResponse> deliveryHistoryList = deliveryService.findDeliveryHistoryAll();
        model.addAttribute("deliverys",deliveryHistoryList);
        return "admin/adminDelivery";
    }

    @ResponseBody
    @PatchMapping(value = "/deliveryUpdate", consumes = "application/json", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> deliveryUpdate(@RequestBody DeliveryNoRequest deliveryNoRequest) {
        deliveryService.deliveryUpdate(deliveryNoRequest.getDeliveryNo());
        return new ResponseEntity<>("deliveryUpdate 성공", HttpStatus.OK);
    }


}
