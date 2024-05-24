package com.its.provafinale.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cliente")
public class TbCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private long id;
    @Column(name = "name_cliente")
    private String name;
    @Column(name = "surnname_cliente")
    private String surname;
    @Column(name = "email_cliente")
    private String email;

    public TbCliente(long id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public TbCliente() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
