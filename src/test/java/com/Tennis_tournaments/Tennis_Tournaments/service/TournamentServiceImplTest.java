package com.Tennis_tournaments.Tennis_Tournaments.service;

import com.Tennis_tournaments.Tennis_Tournaments.entity.Tournament;
import com.Tennis_tournaments.Tennis_Tournaments.repository.TournamentRepository;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class TournamentServiceImplTest {

    @Mock
    private TournamentRepository tournamentRepository;

    private TournamentServiceImpl tournamentService;

    @BeforeEach
    public void setUp() {tournamentService= new TournamentServiceImpl(tournamentRepository);}

    @Test
    public void verifyfindAll() {
        tournamentService.findAll();

        Mockito.verify(tournamentRepository, Mockito.times(1)).findAll();
    }
    @Test
    public void verifySave(){
        Tournament expected= Tournament.builder()

                .id(1L)
                .TournamentName("Wimbledon")
                .build();

        Mockito.when(tournamentRepository.save(Tournament.class))
                .thenReturn(Tournament.builder().id(1L).TournamentName("Wimbledon").build());

        Tournament actual=tournamentService.save(expected);

        Mockito.verify(tournamentRepository,Mockito.times(1)).save(expected);
        assertEquals(expected.getId(),actual.getId();
        assertEquals(expected.getTournamentName()),actual.getTournamentName();

    }
}
