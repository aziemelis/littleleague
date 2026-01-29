package com.aziemelis.littleleauge.domain.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamDto {

    private Long team_id;
    private String fullName;
    private String abbreviation;
    private String nickname;
    private String city;
    private Integer yearFounded;
    private Integer yearActiveTill;
    private String arena;
    private String headCoach;
    private String generalManager;
    private String owner;
}

//        "TEAM_ID",
//                "ABBREVIATION",
//                "NICKNAME",
//                "YEARFOUNDED",
//                "CITY",
//                "ARENA",
//                "ARENACAPACITY",
//                "OWNER",
//                "GENERALMANAGER",
//                "HEADCOACH",
