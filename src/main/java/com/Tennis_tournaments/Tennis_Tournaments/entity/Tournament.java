package com.Tennis_tournaments.Tennis_Tournaments.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name="tournaments")


public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String TournamentName;

    @ManyToMany
    @JoinTable(
            name= "tournaments_players",
            joinColumns = {@JoinColumn(name="tournament_id")},
            inverseJoinColumns = { @JoinColumn(name= "player_id")}

    )

    private Set<Player> players;

}
