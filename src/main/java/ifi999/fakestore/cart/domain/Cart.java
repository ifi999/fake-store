package ifi999.fakestore.cart.domain;

import ifi999.fakestore.user.domain.Users;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @Enumerated(EnumType.STRING)
    private OrderState state;

    private LocalDateTime orderDate;

}
