package ifi999.fakestore.cart.domain;

import ifi999.fakestore.common.entity.BaseCreateEntity;
import ifi999.fakestore.products.domain.Products;

import javax.persistence.*;

@Entity
public class CartProducts extends BaseCreateEntity {

    @Id
    @Column(name = "cart_product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Products products;

    private Integer quantity;

}
