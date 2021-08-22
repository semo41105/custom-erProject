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
    private String name;
    private String phone;
    private String email;

    private String city;
    private String street;
    private String zipcode;

    @Builder
    public UserDto(String id, String pw, String name, String phone, String email, String city, String street, String zipcode) {
        this.id = id;
        this.pw = pw;
        this.name = name;
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
                .name(name)
                .phone(phone)
                .email(email)
                .address(address)
                .build();
    }

    //Member 엔티티에 빌더패턴 넣지 않고, 여기다가 만들고 대신 매개변수로 Member 객체형태를 받는 방식으로 만듦
    public UserDto toDto(Member member) {
        return UserDto.builder()
                .id(member.getId())
                .pw(member.getPw())
                .name(member.getName())
                .phone(member.getPhone())
                .email(member.getEmail())
                .city(member.getAddress().getCity())
                .street(member.getAddress().getStreet())
                .zipcode(member.getAddress().getZipcode())
                .build();
    }


}
