package ifi999.fakestore.products.domain;

import ifi999.fakestore.common.entity.BaseUpdateEntity;

import javax.persistence.*;

@Entity
public class Category extends BaseUpdateEntity {

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


}
