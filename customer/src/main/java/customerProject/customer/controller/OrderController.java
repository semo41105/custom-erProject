package customerProject.customer.controller;

import com.sun.istack.NotNull;
import customerProject.customer.domain.enums.TType;
import customerProject.customer.dto.ProductRequest;
import customerProject.customer.dto.PurchaseDto;
import customerProject.customer.dto.ShippingDto;
import customerProject.customer.service.PurchaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class OrderController {

    private final PurchaseService purchaseService;

    @PostMapping("/order")
    public String custom(Model model, ProductRequest dto){
        model.addAttribute("ProductRequest", dto);
       if(dto.getName().equals("티셔츠")){

            if(dto.getType().equals(TType.SHORT)){
                switch (dto.getSize()){
                    case S:
                        dto.setPNo(5L);
                        break;
                    case M:
                        dto.setPNo(6L);
                        break;
                    case L:
                        dto.setPNo(7L);
                        break;
                }
            }else if(dto.getType().equals(TType.LONG)){
                switch (dto.getSize()){
                    case S:
                        dto.setPNo(8L);
                        break;
                    case M:
                        dto.setPNo(9L);
                        break;
                    case L:
                        dto.setPNo(10L);
                        break;
                }
            }
        }
        model.addAttribute("PurchaseDto", new PurchaseDto());

        return "purchase/purchase";
    }

    @PostMapping("/purchase")
    public String purchase(Model model, ShippingDto dto){

        model.addAttribute("ShippingDto", dto);
        //데이터 입력 처리
        int result = purchaseService.newOrder(dto);

        if(result == 1){
            model.addAttribute("orderMsg", "주문이 완료되었습니다.");
        }else{
            model.addAttribute("orderMsg", "주문이 실패하였습니다. 다시 시도해주세요.");
        }

        return "purchase/buy";
    }



}
