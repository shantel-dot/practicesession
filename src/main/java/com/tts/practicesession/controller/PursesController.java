package com.tts.practicesession.controller;

import com.tts.practicesession.model.Purses;
import com.tts.practicesession.service.PursesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/purses")
@RestController
public class PursesController {

    PursesService pursesService;

    public PursesController (PursesService pursesService) {

        this.pursesService = pursesService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Optional<Purses>> getPursesById(@PathVariable Long id) {
        return new ResponseEntity<Optional<Purses>>(pursesService.getPurses(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public Iterable<Purses> getAllPurses() {

        return pursesService.getAllPurses();
    }

}