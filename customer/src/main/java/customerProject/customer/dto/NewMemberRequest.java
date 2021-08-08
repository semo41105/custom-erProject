package customerProject.customer.dto;

import customerProject.customer.domain.Address;
import customerProject.customer.domain.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embedded;

@Getter @Setter
@NoArgsConstructor
public class NewMemberRequest {

    private String id;
    private String pw;
    private String userName;
    private String phone;
    private String email;
    @Embedded
    private Address address;


    @Builder
    public NewMemberRequest(String id, String pw, String userName, String phone, String email, Address address) {
        this.id = id;
        this.pw = pw;
        this.userName = userName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Member toEntity() {
        return Member.builder()
                .id(id)
                .pw(pw)
                .name(userName)
                .phone(phone)
                .email(email)
                .address(address)
                .build();
    }

}
