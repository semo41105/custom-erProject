package customerProject.customer.dto;


import customerProject.customer.domain.Member;
import lombok.*;


@Getter @Setter
@NoArgsConstructor
@ToString
public class LoginRequest {

    private String id;
    private String pw;

    @Builder
    public LoginRequest(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public Member toEntity() {
        return Member.builder()
                .id(id)
                .pw(pw)
                .build();
    }

}
