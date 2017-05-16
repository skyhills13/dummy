package com.skyhills.dummy.repository;

import com.skyhills.dummy.domain.dto.PetResponse;

import java.util.List;

/**
 * Created by soeunpark on 2017. 5. 16..
 */
public interface PetRepositoryCustom {
    List<PetResponse> findByPetName(String petName);
}
