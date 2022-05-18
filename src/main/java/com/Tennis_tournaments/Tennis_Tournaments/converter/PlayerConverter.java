package com.Tennis_tournaments.Tennis_Tournaments.converter;


import com.Tennis_tournaments.Tennis_Tournaments.entity.Player;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayerConverter {

    public Player map(){
        return Player.builder()
                .PlayerRank(playerRequest.getPlayerRank())
                .PlayerName(playerRequest.getPlayerName())
                .build();

    }
}
