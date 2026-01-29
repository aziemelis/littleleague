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
@Table(name = "team")
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_id_seq")
    private Long team_id;
    private String fullName;
    private String abbreviation;
    private String nickname;
    private String city;
    private Integer yearFounded;
    private Integer yearActiveTill;
}
