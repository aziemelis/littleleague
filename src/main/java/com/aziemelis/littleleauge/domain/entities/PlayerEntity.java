package com.aziemelis.littleleauge.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "player")
public class PlayerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_id_seq")
    private Long id;

    private String firstName;
    private String lastName;
    private String fullName;
    private String gamesPlayedCurrentSeasonFlag;
    private String displayFirstLast;
    private String displayLastCommaFirst;
    private String displayFiLast;
    private String playerSlug;
    private String birthdate;
    private String country;
    private String height;
    private Integer weight;
    private Integer seasonExp;
    private Integer jersey;
    private String position;
    private Integer teamId;
    private String teamName;
    private String teamAbbreviation;
    private String teamCode;
    private String teamCity;
    private String playerCode;
    private String fromYear;
    private String toYear;
    private String gamesPlayedFlag;
    private String rosterStatus;
}


// Request Body Json example:
//{
//        "firstName": "LeBron",
//        "lastName": "James",
//        "birthdate": "1984-12-30T00:00:00",
//        "country": "USA",
//        "height": "6-9",
//        "weight": 250,
//        "jersey": 23,
//        "position": "Forward",
//        "teamId": 1610612747,
//}