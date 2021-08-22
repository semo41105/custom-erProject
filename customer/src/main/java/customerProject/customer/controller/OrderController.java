package customerProject.customer.controller;

import customerProject.customer.dto.ProductRequest;
import customerProject.customer.dto.PurchaseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class OrderController {

    @PostMapping("/order")
    public String custom(Model model, ProductRequest dto){
        model.addAttribute("ProductRequest", dto);
        model.addAttribute("PurchaseDto", new PurchaseDto());

        return "purchase/purchase";
    }



}
