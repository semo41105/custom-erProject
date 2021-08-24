package customerProject.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String adminIndex() {
        return "admin/adminIndex";
    }

    @GetMapping("/admin/adminDelivery")
    public String adminDelivery() {
        return "admin/adminDelivery";
    }

    @GetMapping("/admin/adminOrder")
    public String adminOrder() {
        return "admin/adminOrder";
    }

}
