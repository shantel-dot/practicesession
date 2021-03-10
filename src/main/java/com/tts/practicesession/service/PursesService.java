package com.tts.practicesession.service;

import com.tts.practicesession.model.Purses;

import java.util.Optional;

public interface PursesService {

    Optional<Purses> getPurses(Long id);
    Iterable<Purses> getAllPurses();

}