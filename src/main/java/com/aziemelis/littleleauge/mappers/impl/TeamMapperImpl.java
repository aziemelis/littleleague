package com.aziemelis.littleleauge.mappers.impl;

import com.aziemelis.littleleauge.domain.dto.TeamDto;
import com.aziemelis.littleleauge.domain.entities.TeamEntity;
import com.aziemelis.littleleauge.mappers.Mapper;
import org.modelmapper.ModelMapper;

public class TeamMapperImpl implements Mapper<TeamEntity, TeamDto> {

    private final ModelMapper modelMapper;

    public TeamMapperImpl() {
        this.modelMapper = new ModelMapper();
    }

    @Override
    public TeamDto mapTo(TeamEntity teamEntity) {
        return modelMapper.map(teamEntity, TeamDto.class);
    }

    @Override
    public TeamEntity mapFrom(TeamDto teamDto) {
        return modelMapper.map(teamDto, TeamEntity.class);
    }
}
