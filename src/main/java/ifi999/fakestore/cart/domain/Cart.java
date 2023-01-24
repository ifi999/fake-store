package ifi999.fakestore.cart.domain;

import ifi999.fakestore.common.entity.BaseCreateEntity;
import ifi999.fakestore.user.domain.Users;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Cart extends BaseCreateEntity {

    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    @Enumerated(EnumType.STRING)
    private OrderState state;

    private LocalDateTime orderDate;

}
