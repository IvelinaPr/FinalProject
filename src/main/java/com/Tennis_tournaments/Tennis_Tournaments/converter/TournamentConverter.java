package com.Tennis_tournaments.Tennis_Tournaments.converter;


import com.Tennis_tournaments.Tennis_Tournaments.dto.PlayerRequest;
import com.Tennis_tournaments.Tennis_Tournaments.dto.TournamentRequest;
import com.Tennis_tournaments.Tennis_Tournaments.entity.Tournament;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collector;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor

public class TournamentConverter {

    private PlayerConverter playerConverter;

    public Tournament map(TournamentRequest tournamentRequest){

        return Tournament.builder()

                .TournamentName(tournamentRequest.getTournamentName())
                .players(tournamentRequest.getPlayerRequests().stream()
                        .map(playerRequest -> playerConverter.map(playerRequest))
                .collect(Collectors.toSet()))
                .build();


    }
}
