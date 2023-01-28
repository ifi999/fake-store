package ifi999.fakestore.user.domain;

import ifi999.fakestore.common.entity.BaseUpdateEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users extends BaseUpdateEntity {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String phone;

    @Embedded
    private Name name;

    @Embedded
    private Address address;

    @Builder
    public Users(String email, String username, String password, String phone, Name name, Address address) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.name = name;
        this.address = address;
    }
}
