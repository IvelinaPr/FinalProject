package com.Tennis_tournaments.Tennis_Tournaments.service;


import com.Tennis_tournaments.Tennis_Tournaments.entity.Player;

import java.util.List;

public interface PlayerService {

    Player save(Player player);

    List<Player>findAll();


}
