package com.Tennis_tournaments.Tennis_Tournaments.repository;

import com.Tennis_tournaments.Tennis_Tournaments.entity.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament,Long> {


    List<Tournament> findAllByName(String name);

}
