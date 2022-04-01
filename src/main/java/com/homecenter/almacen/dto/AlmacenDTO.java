package com.homecenter.almacen.dto;

import javax.persistence.Column;
import java.time.LocalDate;

public class AlmacenDTO {
    private Long id;
    private String name;
    private LocalDate dateConfig;
    private int clientCapacity;

    public AlmacenDTO(Long id, String name, LocalDate dateConfig, int clientCapacity) {
        this.id = id;
        this.name = name;
        this.dateConfig = dateConfig;
        this.clientCapacity = clientCapacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateConfig() {
        return dateConfig;
    }

    public void setDateConfig(LocalDate dateConfig) {
        this.dateConfig = dateConfig;
    }

    public int getClientCapacity() {
        return clientCapacity;
    }

    public void setClientCapacity(int clientCapacity) {
        this.clientCapacity = clientCapacity;
    }

    @Override
    public String toString() {
        return "AlmacenDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateConfig=" + dateConfig +
                ", clientCapacity=" + clientCapacity +
                '}';
    }
}
