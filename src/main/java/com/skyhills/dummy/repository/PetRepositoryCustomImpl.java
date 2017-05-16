package com.skyhills.dummy.repository;

import com.mysema.query.jpa.JPQLQuery;
import com.mysema.query.types.Projections;
import com.skyhills.dummy.domain.Pet;
import com.skyhills.dummy.domain.QPet;
import com.skyhills.dummy.domain.dto.PetResponse;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.util.List;

/**
 * Created by soeunpark on 2017. 5. 16..
 */
public class PetRepositoryCustomImpl extends QueryDslRepositorySupport implements PetRepositoryCustom{
    public PetRepositoryCustomImpl() {
        super(Pet.class);
    }

    @Override
    public List<PetResponse> findByPetName(String petName) {
        QPet pet = QPet.pet;
        JPQLQuery query = from(pet).where(pet.petName.eq(petName));
        return query.list(Projections.bean(PetResponse.class, pet.petId));
    }
}
