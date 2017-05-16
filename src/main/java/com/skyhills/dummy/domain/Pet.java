package com.skyhills.dummy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by soeunpark on 2017. 5. 16..
 */
@Entity
public class Pet {
    @Id
    @GeneratedValue
    private Long petId;
    private String petName;
    private String address;
    private Integer weight;
    private Integer height;

    public Long getPetId() {
        return petId;
    }

    public String getPetName() {
        return petName;
    }

    public String getAddress() {
        return address;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }
}
