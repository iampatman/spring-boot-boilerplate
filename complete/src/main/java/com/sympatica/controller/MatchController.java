package com.sympatica.controller;

import com.sympatica.entity.Match;
import com.sympatica.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by NguyenTrung on 15/9/17.
 */
@RestController
@RequestMapping(value = "/matches")
public class MatchController {
    @Autowired
    private MatchRepository matchRepository;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Iterable<Match> getMatch(@PathVariable long id) {
        List<Match> matches = matchRepository.findById(id);
        System.out.println("done");
        return matches;
    }
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Match> getAllMatches() {
        return matchRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity addNewMatch(@RequestBody Match match){
        matchRepository.save(match);
        return ResponseEntity.accepted().build();
    }
}
