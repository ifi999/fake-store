package ifi999.fakestore.products.domain;

import ifi999.fakestore.common.entity.BaseUpdateEntity;

import javax.persistence.*;

@Entity
public class Products extends BaseUpdateEntity {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer price;

    private String description;

    private String image;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

}
