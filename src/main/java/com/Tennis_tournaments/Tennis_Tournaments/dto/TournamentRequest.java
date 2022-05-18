package com.Tennis_tournaments.Tennis_Tournaments.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder


public class TournamentRequest {

    private String TournamentName;

    private Set<PlayerRequest> playerRequests;
}
