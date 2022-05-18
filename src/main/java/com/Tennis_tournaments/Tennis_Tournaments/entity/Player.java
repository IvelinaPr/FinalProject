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
@Table(name="players", indexes = {
        @Index(name= "idx_PlayerName",columnList = "PlayerName"),
        @Index(name="idx_PlayerRank", columnList = "PlayerRank")
        })

public class Player {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String PlayerName;

    @Column(nullable = false)
    private Integer PlayerRank;

    @ManyToMany(mappedBy ="players")
    private Set<Tournament>tournaments;

}
