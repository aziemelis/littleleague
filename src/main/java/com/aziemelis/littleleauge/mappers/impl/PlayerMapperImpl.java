package com.aziemelis.littleleauge.mappers.impl;

import com.aziemelis.littleleauge.domain.dto.PlayerDto;
import com.aziemelis.littleleauge.domain.entities.PlayerEntity;
import com.aziemelis.littleleauge.mappers.Mapper;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapperImpl implements Mapper<PlayerEntity, PlayerDto> {
    private final ModelMapper modelMapper;

    public PlayerMapperImpl() {
        modelMapper = new ModelMapper();
        TypeMap<PlayerDto, PlayerEntity> map = modelMapper.createTypeMap(PlayerDto.class, PlayerEntity.class);
        map.addMappings(m -> {
            m.skip(PlayerEntity::setPlayerSlug);  // Ignore extras
            m.using((Converter<PlayerDto, String>) ctx ->
                            ctx.getSource().getFirstName() + " " + ctx.getSource().getLastName())
                    .map(PlayerDto::getFirstName, PlayerEntity::setFullName);
        });
    }

    @Override
    public PlayerDto mapTo(PlayerEntity playerEntity) {
        return modelMapper.map(playerEntity, PlayerDto.class);
    }

    @Override
    public PlayerEntity mapFrom(PlayerDto playerDto) {
        return modelMapper.map(playerDto, PlayerEntity.class);
    }
}
