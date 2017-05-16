package com.skyhills.dummy.repository;

import com.skyhills.dummy.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by soeunpark on 2017. 5. 16..
 */
public interface PetRepository extends JpaRepository<Pet, Long>, PetRepositoryCustom{

}
