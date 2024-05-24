package com.its.provafinale.dtos;

import java.time.LocalDate;

public class SegnalazioneDto {
    private long id;
    private String description;
    private LocalDate date;
    private ClienteDto cliente;
    private TecnicoDto tecnico;

    public SegnalazioneDto(long id, String description, LocalDate date, ClienteDto cliente, TecnicoDto tecnico) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.cliente = cliente;
        this.tecnico = tecnico;
    }

    public SegnalazioneDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ClienteDto getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDto cliente) {
        this.cliente = cliente;
    }

    public TecnicoDto getTecnico() {
        return tecnico;
    }

    public void setTecnico(TecnicoDto tecnico) {
        this.tecnico = tecnico;
    }
}
