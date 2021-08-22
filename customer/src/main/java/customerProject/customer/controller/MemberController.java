package customerProject.customer.controller;

import customerProject.customer.dto.LoginRequest;
import customerProject.customer.dto.UserDto;
import customerProject.customer.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    @PostMapping("/newMember")
    public String newMember(Model model, UserDto dto) {
        memberService.newMember(dto);//회원등록
        return "redirect:/loginPage";
    }

    @PostMapping("/login")
    public String login(LoginRequest loginDto, HttpSession session, Model model) {
        UserDto loginUser = memberService.login(loginDto);

        if(loginUser != null) {
            session.setAttribute("loginUser", loginUser);
            return "index";
        }else{
            //추후 메시지Dto 만들어서 경고창 띄워줘야 함
            model.addAttribute("msg", "로그인 실패! 아이디 및 비밀번호를 확인해주세요!");
            model.addAttribute("url", "/loginPage");
            return "common/alertPage";
        }

    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }



}
