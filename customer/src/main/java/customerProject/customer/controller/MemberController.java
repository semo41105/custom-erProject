package customerProject.customer.controller;

import customerProject.customer.dto.NewMemberRequest;
import customerProject.customer.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    @PostMapping("/newMember")
    public String newMember(Model model, NewMemberRequest dto) {

        memberService.newMember(dto);//회원등록

        return "login/login";
    }

}
