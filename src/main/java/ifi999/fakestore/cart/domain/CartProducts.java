package ifi999.fakestore.cart.domain;

import ifi999.fakestore.products.domain.Products;

import javax.persistence.*;

@Entity
public class CartProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    private Products products;

    private Integer quantity;

}
