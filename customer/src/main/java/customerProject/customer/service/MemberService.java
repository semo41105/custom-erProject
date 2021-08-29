package customerProject.customer.service;

import customerProject.customer.domain.Member;
import customerProject.customer.dto.LoginRequest;
import customerProject.customer.dto.UserDto;
import customerProject.customer.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public Long newMember(UserDto requestDto) {
        Long result = memberRepository.save(requestDto.toEntity()).getNo();

        return result;
    }

    @Transactional
    public UserDto login(LoginRequest loginDto) {
        Member loginUser = memberRepository.findUser(loginDto.getId(), loginDto.getPw());
        UserDto userDto = null;
        if (loginUser != null) {
            //userDto = modelMapper.map(loginUser, UserDto.class);
            userDto = UserDto.toDto(loginUser);
        }
        return userDto;
    }


}

