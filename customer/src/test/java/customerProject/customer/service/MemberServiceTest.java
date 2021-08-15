package customerProject.customer.service;

import customerProject.customer.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MemberServiceTest {

    @Autowired
    MemberRepository memberRepository;
    @Autowired
    MemberService memberService;

//    @Test
////    @Rollback(false)
//    @Transactional
//    public void 회원가입() {
//        //given
//        String id = "회원1";
//        String pw = "1234";
//        String name = "김회원";
//        String phone = "010-1111-1111";
//        String email = "thal111@dd.com";
//
//        Address address = new Address("서울시","중구로","002");
//
//        NewMemberRequest dto = NewMemberRequest.builder()
//                                    .id(id)
//                                    .pw(pw)
//                                    .userName(name)
//                                    .phone(phone)
//                                    .email(email)
//                                    .address(address)
//                                    .build();
//
//        //when
//        Member resultMember = memberRepository.save(dto.toEntity());
//
//        //then
//        assertEquals("김회원", resultMember.getName() );
//    }

}
