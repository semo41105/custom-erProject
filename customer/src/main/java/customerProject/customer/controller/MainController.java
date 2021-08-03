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

    @GetMapping("/login")
    public String loginpage(){
        return "login";
    }

    @GetMapping("/login/signup")
    public String signup(){
        return "signup";
    }

    @GetMapping("/product/note")
    public String note(){
        return "note";
    }

    @GetMapping("/product/sticker")
    public String sticker(){
        return "sticker";
    }

    @GetMapping("/product/griptok")
    public String griptok(){
        return "griptok";
    }

    @GetMapping("/product/cup")
    public String cup(){
        return "cup";
    }

    @GetMapping("/product/tshirts")
    public String tshirts(){
        return "tshirts";
    }
}
