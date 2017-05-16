package com.skyhills.dummy.repository;

import com.skyhills.dummy.domain.dto.PetResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by soeunpark on 2017. 5. 16..
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class PetRepositoryCustomImplTest {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PetRepository petRepository;

    @Test
    public void findByPetName() throws Exception {
        List<PetResponse> petList  = petRepository.findByPetName("aaa");
        logger.debug("petList : {}", petList);
    }

}