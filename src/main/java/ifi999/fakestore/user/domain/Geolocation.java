package ifi999.fakestore.user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Geolocation {

    @Column(name = "lat")
    private Float latitude;

    @Column(name = "long")
    private Float longitude;

}
