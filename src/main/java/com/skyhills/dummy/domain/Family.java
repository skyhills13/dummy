package com.skyhills.dummy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by soeunpark on 2017. 5. 16..
 */
@Entity
public class Family {

    @Id
    @GeneratedValue
    private Long familyId;

    private String familyName;

    private String numberOfPeople;


    public Long getFamilyId() {
        return familyId;
    }

    public String getFamilyName() {
        return familyName;
    }
}
