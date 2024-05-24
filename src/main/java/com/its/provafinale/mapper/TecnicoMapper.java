package com.its.provafinale.mapper;

import com.its.provafinale.dtos.TecnicoDto;
import com.its.provafinale.entities.TbCliente;
import com.its.provafinale.entities.TbTecnico;
import org.springframework.stereotype.Component;

@Component
public class TecnicoMapper {
    public TecnicoDto toDto(TbTecnico tbTecnico){
        TecnicoDto dto = new TecnicoDto(
                tbTecnico.getId(),
                tbTecnico.getName(),
                tbTecnico.getSurname()
        );
        return dto;
    }

    public TbTecnico toEntity(TecnicoDto dto){
        TbTecnico entity = new TbTecnico(
                dto.getId(),
                dto.getName(),
                dto.getSurname()
        );
        return entity;
    }
}
