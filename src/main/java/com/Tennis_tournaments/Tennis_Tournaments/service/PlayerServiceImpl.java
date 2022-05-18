package com.Tennis_tournaments.Tennis_Tournaments.service;


import com.Tennis_tournaments.Tennis_Tournaments.entity.Player;
import com.Tennis_tournaments.Tennis_Tournaments.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;
    public PlayerServiceImpl(final PlayerRepository playerRepository){
        this.playerRepository=playerRepository;
    }


    @Override
    public Player save(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public List<Player> findAll() {
        return playerRepository.findAll();
    }
}
