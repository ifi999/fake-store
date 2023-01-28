package ifi999.fakestore.user.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Getter
@Embeddable
@NoArgsConstructor
public class Address {

    private String city;

    private String street;

    private Integer number;

    private String zipcode;

    @Embedded
    private Geolocation geolocation;

    @Builder
    public Address(String city, String street, Integer number, String zipcode, Geolocation geolocation) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.zipcode = zipcode;
        this.geolocation = geolocation;
    }
}
