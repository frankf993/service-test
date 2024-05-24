package com.its.provafinale.mapper;

import com.its.provafinale.dtos.ClienteDto;
import com.its.provafinale.entities.TbCliente;
import jakarta.persistence.Column;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {
    public ClienteDto toDto(TbCliente tbCliente){
        ClienteDto dto = new ClienteDto(
                tbCliente.getId(),
                tbCliente.getName(),
                tbCliente.getSurname(),
                tbCliente.getEmail()
        );
        return dto;
    }

    public TbCliente toEntity(ClienteDto dto){
        TbCliente entity = new TbCliente(
                dto.getId(),
                dto.getName(),
                dto.getSurname(),
                dto.getEmail()
        );
        return entity;
    }
}
