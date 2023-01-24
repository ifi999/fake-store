package ifi999.fakestore.user.domain;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Address {

    private String city;

    private String street;

    private Integer number;

    private String zipcode;

    @Embedded
    private Geolocation geolocation;

}
