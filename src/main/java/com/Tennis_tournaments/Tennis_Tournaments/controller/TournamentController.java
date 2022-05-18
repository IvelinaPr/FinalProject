package com.Tennis_tournaments.Tennis_Tournaments.controller;


import com.Tennis_tournaments.Tennis_Tournaments.dto.TournamentRequest;
import com.Tennis_tournaments.Tennis_Tournaments.dto.TournamentResponse;
import com.Tennis_tournaments.Tennis_Tournaments.service.TournamentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/tournaments")
public class TournamentController {


    private final TournamentService tournamentService;

    @PostMapping
    public ResponseEntity<TournamentResponse> save (final TournamentRequest tournamentRequest){


    }

}
