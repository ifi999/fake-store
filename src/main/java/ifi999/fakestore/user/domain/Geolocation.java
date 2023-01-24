package ifi999.fakestore.user.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Geolocation {

    @Column(name = "lat")
    private Float latitude;

    @Column(name = "long")
    private Float longitude;

}
