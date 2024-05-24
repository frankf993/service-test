package com.its.provafinale.mapper;

import com.its.provafinale.dtos.SegnalazioneDto;
import com.its.provafinale.entities.TbSegnalazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SegnalazioneMapper {
    @Autowired
    ClienteMapper clienteMapper;
    @Autowired
    TecnicoMapper tecnicoMapper;

    public SegnalazioneDto toDto(TbSegnalazione tbSegnalazione){
        SegnalazioneDto dto = new SegnalazioneDto(
                tbSegnalazione.getId(),
                tbSegnalazione.getDescription(),
                tbSegnalazione.getDate(),
                clienteMapper.toDto(tbSegnalazione.getCliente()),
                tecnicoMapper.toDto(tbSegnalazione.getTecnico())
        );
        return dto;
    }

    public TbSegnalazione toEntity(SegnalazioneDto dto){
        TbSegnalazione entity = new TbSegnalazione(
                dto.getId(),
                dto.getDescription(),
                dto.getDate(),
                clienteMapper.toEntity(dto.getCliente()),
                tecnicoMapper.toEntity(dto.getTecnico())
        );
        return entity;
    }

    public List<SegnalazioneDto> toDtoList(List<TbSegnalazione> enititiesList){
        return enititiesList.stream().map(this::toDto).toList();
    }
}
