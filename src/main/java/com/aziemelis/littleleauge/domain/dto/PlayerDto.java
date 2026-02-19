package com.aziemelis.littleleauge.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String fullName;
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
    private String gamesPlayedCurrentSeasonFlag;
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
