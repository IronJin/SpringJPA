package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter //임베디드 타입은 변경이 되면 안된다.
public class Address {

    private String city;
    private String street;
    private String zipcode;

    public Address (String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    protected Address() {
    }

}
