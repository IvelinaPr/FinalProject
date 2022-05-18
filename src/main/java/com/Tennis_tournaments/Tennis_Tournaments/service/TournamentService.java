package com.Tennis_tournaments.Tennis_Tournaments.service;

import com.Tennis_tournaments.Tennis_Tournaments.entity.Tournament;

import java.util.List;

public interface TournamentService {


    Tournament save(Tournament tournament);


    List<Tournament> findAll();

    List<Tournament> findAllByTournamentName(String TournamentName);

    }



