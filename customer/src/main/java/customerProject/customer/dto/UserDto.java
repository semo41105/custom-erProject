package customerProject.customer.dto;

import customerProject.customer.domain.Address;
import customerProject.customer.domain.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class UserDto {

    private String id;
    private String pw;
    private String userName;
    private String phone;
    private String email;

    private String city;
    private String street;
    private String zipcode;

    @Builder
    public UserDto(String id, String pw, String name, String phone, String email, String city, String street, String zipcode) {
        this.id = id;
        this.pw = pw;
        this.userName = userName;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }


    public Member toEntity() {
        Address address = new Address(city, street, zipcode);
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
