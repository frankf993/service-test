package com.its.provafinale.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.time.LocalDate;

@Entity
@Table(name = "tb_segnalazione")
public class TbSegnalazione {
    @Id
    @GeneratedValue
    @Column(name = "id_segnalazione")
    private long id;
    @Column(name = "description_segnalazione")
    private String description;
    @Column(name = "date_segnalazione")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate date;
    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn(name = "id_cliente", nullable = false)
    private TbCliente cliente;
    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn(name = "id_tecnico", nullable = false)
    private TbTecnico tecnico;

    public TbSegnalazione(long id, String description, LocalDate date, TbCliente cliente, TbTecnico tecnico) {
        this.id = id;
        this.description = description;
        this.date = date;
        this.cliente = cliente;
        this.tecnico = tecnico;
    }

    public TbSegnalazione() {
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

    public TbCliente getCliente() {
        return cliente;
    }

    public void setCliente(TbCliente cliente) {
        this.cliente = cliente;
    }

    public TbTecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(TbTecnico tecnico) {
        this.tecnico = tecnico;
    }
}
