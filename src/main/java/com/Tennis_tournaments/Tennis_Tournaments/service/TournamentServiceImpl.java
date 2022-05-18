package com.Tennis_tournaments.Tennis_Tournaments.service;


import com.Tennis_tournaments.Tennis_Tournaments.entity.Tournament;
import com.Tennis_tournaments.Tennis_Tournaments.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentServiceImpl implements TournamentService{


    private final TournamentRepository tournamentRepository;


    public TournamentServiceImpl(final TournamentRepository tournamentRepository) {
        this.tournamentRepository=tournamentRepository;
    }


    @Override
    public Tournament save(Tournament tournament) {

        return tournamentRepository.save(tournament);
    }

    @Override
    public List<Tournament> findAll() {
        return null;
    }

    @Override
    public List<Tournament> findAllByName(String name) {
        tournamentRepository.findAll();
        return tournamentRepository.findAllByName(name);
    }
}
