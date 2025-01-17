package com.its.provafinale.dtos;

public class TecnicoDto {
    private long id;
    private String name;
    private String surname;

    public TecnicoDto(long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public TecnicoDto() {
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
}
