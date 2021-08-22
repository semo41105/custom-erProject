package customerProject.customer.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class PurchaseDto {

    private String name;
    private String phone;
    private String city;
    private String street;
    private String zipcode;


    public PurchaseDto(String name, String phone, String city, String street, String zipcode) {
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }


}
