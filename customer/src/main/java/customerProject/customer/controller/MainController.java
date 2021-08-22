package customerProject.customer.controller;

import customerProject.customer.dto.LoginRequest;
import customerProject.customer.dto.ProductRequest;
import customerProject.customer.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MainController {

    @GetMapping("/")
    public String main(){
        return "index";
    }

    @GetMapping("/loginPage")
    public String loginpage(Model model){
        model.addAttribute("LoginRequest", new LoginRequest());
        return "login/login";
    }

    @GetMapping("/login/signupPage")
    public String signup(Model model){
        model.addAttribute("UserDto", new UserDto());
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
    public String custom(Model model, @Param("name")String name, @Param("korName")String korName){
        model.addAttribute("name", name);
        model.addAttribute("korName", korName);
        model.addAttribute("imgSrc", "/img/"+name+".png");
        model.addAttribute("ProductRequest", new ProductRequest());
        return "custom/custom";
    }

}
