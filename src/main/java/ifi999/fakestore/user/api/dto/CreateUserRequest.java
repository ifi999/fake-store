package ifi999.fakestore.user.api.dto;

import ifi999.fakestore.user.domain.Address;
import ifi999.fakestore.user.domain.Geolocation;
import ifi999.fakestore.user.domain.Name;
import ifi999.fakestore.user.domain.Users;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Size;

@Builder // TODO - test code 작성할 때 필요해서 넣긴 했는데 없이 못하는지 알아보기
@Getter
public class CreateUserRequest {

    // TODO - validation

//    @Email(regexp = "", message = "올바른 형식의 이메일을 넣어주세요.")
    @Size(max = 255)
    private String email;

    @Size(max = 255)
    private String username;

    @Size(min = 8, max = 255)
    private String password;

    @Size(max = 255)
    private String firstname;

    @Size(max = 255)
    private String lastname;

    @Size(max = 255)
    private String city;

    @Size(max = 255)
    private String street;

    @Size(max = 255)
    private Integer number;

    @Size(max = 255)
    private String zipcode;

    @Size(max = 255)
    private String phone;

    // 소수점 validation 어떻게?
    private Float latitude;
    private Float longitude;

    public static Users toEntity(CreateUserRequest req) {
        Address address = Address.builder()
                .city(req.getCity())
                .number(req.getNumber())
                .street(req.getStreet())
                .zipcode(req.getZipcode())
                .geolocation(new Geolocation(req.getLatitude(), req.getLongitude()))
                .build();

        return Users.builder()
                .email(req.getEmail())
                .password(req.getPassword())
                .name(new Name(req.getFirstname(), req.getLastname()))
                .username(req.getUsername())
                .phone(req.getPhone())
                .address(address)
                .build();
    }
}
