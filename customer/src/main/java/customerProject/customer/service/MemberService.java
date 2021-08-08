package customerProject.customer.service;

import customerProject.customer.dto.NewMemberRequest;
import customerProject.customer.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public Long newMember(NewMemberRequest requestDto) {
        Long result = memberRepository.save(requestDto.toEntity()).getNo();

//        if (result != 0) {
//            model.addAttribute("message", "회원가입 성공!");
//        } else {
//            model.addAttribute("message", "회원가입 실패!");
//        }
        return result;
    }


}

