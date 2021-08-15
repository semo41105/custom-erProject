package customerProject.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin/adminIndex")
    public String adminIndex() {
        return "admin/adminIndex";
    }

    @GetMapping("/admin/adminProduct")
    public String adminProduct() {
        return "admin/adminProduct";
    }

    @GetMapping("/admin/adminOrder")
    public String adminOrder() {
        return "admin/adminOrder";
    }

}
