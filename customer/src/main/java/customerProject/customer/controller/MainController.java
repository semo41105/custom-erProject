package customerProject.customer.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MainController {

    @GetMapping("/")
    public String main(){
        return "index";
    }

    @GetMapping("/loginPage")
    public String loginpage(){
        return "login/login";
    }

    @GetMapping("/login/signupPage")
    public String signup(){
        return "login/signup";
    }

    @GetMapping("/product/note")
    public String note(){
        return "product/note";
    }

    @GetMapping("/product/sticker")
    public String sticker(){
        return "product/sticker";
    }

    @GetMapping("/product/griptok")
    public String griptok(){
        return "product/griptok";
    }

    @GetMapping("/product/cup")
    public String cup(){
        return "product/cup";
    }

    @GetMapping("/product/tshirts")
    public String tshirts(){
        return "product/tshirts";
    }

    @GetMapping("/purchasePage")
    public String purchase(){
        return "purchase/purchase";
    }

    @GetMapping("/customPage")
    public String custom(){
        return "custom/custom";
    }

}
