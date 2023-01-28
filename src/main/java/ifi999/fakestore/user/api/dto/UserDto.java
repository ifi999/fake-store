package ifi999.fakestore.user.api.dto;

import ifi999.fakestore.user.domain.Address;
import ifi999.fakestore.user.domain.Name;
import ifi999.fakestore.user.domain.Users;
import lombok.Builder;
import lombok.Getter;

@Getter
public class UserDto {

    private Long id;
    private String email;
    private String username;
    private String password;
    private Name name;
    private Address address;
    private String phone;

    @Builder
    public UserDto(Long id, String email, String username, String password, Name name, Address address, String phone) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public static UserDto of(Users user) {
        return UserDto.builder()
                .id(user.getId())
                .email(user.getEmail())
                .password(user.getPassword())
                .name(user.getName())
                .address(user.getAddress())
                .phone(user.getPhone())
                .build();
    }
}
