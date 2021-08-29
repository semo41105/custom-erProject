package customerProject.customer.controller;

import customerProject.customer.dto.ProductRequest;
import customerProject.customer.dto.PurchaseDto;
import customerProject.customer.dto.ShippingDto;
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

    @PostMapping("/purchase")
    public String purchase(Model model, ShippingDto dto){

        model.addAttribute("ShippingDto", dto);
        //입력처리
        
        return "purchase/buy";
    }



}
