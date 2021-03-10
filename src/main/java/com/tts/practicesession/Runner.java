package com.tts.practicesession;

import com.tts.practicesession.model.Purses;
import com.tts.practicesession.repo.PursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class Runner implements CommandLineRunner {

    @Autowired
    PursesRepository pursesRepository;


    @Override
    public void run(String... args) throws Exception {

        pursesRepository.save(new Purses("brown", "brahim"));
        pursesRepository.save(new Purses("black", "coach"));
        pursesRepository.save(new Purses("blue", "mk"));

    }
}
