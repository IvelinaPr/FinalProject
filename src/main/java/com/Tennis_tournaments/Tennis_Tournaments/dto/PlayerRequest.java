package com.Tennis_tournaments.Tennis_Tournaments.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class PlayerRequest {

    private String PlayerName;

    private Integer PlayerRank;
}
