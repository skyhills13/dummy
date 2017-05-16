package com.skyhills.dummy.repository;

import com.skyhills.dummy.DummyApplication;
import com.skyhills.dummy.domain.Pet;
import com.skyhills.dummy.domain.dto.PetResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by soeunpark on 2017. 5. 16..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DummyApplication.class)
public class PetRepositoryCustomImplTest {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PetRepository petRepository;

    @Before
    public void before(){
        petRepository.save(new Pet("aaa", "address1", 100, 200));
        petRepository.save(new Pet("aaa", "address2", 100, 200));
        petRepository.save(new Pet("bbb", "address3", 100, 200));
    }
    @Test
    public void findByPetName() throws Exception {
        List<PetResponse> petList  = petRepository.findByPetName("aaa");
        logger.debug("########petList######### : {}", petList);
    }

}