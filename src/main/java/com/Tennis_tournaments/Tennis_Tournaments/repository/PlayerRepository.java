package com.Tennis_tournaments.Tennis_Tournaments.repository;

import com.Tennis_tournaments.Tennis_Tournaments.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {
}
