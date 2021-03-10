package com.tts.practicesession.service;

import com.tts.practicesession.model.Purses;
import com.tts.practicesession.repo.PursesRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PursesServiceImpl implements PursesService {

    PursesRepository pursesRepository;

    public PursesServiceImpl (PursesRepository pursesRepository) {
        this.pursesRepository = pursesRepository;
    }

    @Override
    public Optional<Purses> getPurses(Long id) {
        return pursesRepository.findById(id);
    }

    @Override
    public Iterable<Purses> getAllPurses() {
        return pursesRepository.findAll();
    }
}