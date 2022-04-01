package com.homecenter.almacen.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Almacen {
    private Long id;
    //nombre
    private String name;
    //fecha de configuración
    private LocalDate dateConfig;
    //capacidad de clientes
    private int clientCapacity;

    public Almacen(Long id, String name, LocalDate dateConfig, int clientCapacity) {
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
        return "Almacen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateConfig=" + dateConfig +
                ", clientCapacity=" + clientCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Almacen almacen = (Almacen) o;
        return clientCapacity == almacen.clientCapacity && Objects.equals(id, almacen.id) && Objects.equals(name, almacen.name) && Objects.equals(dateConfig, almacen.dateConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateConfig, clientCapacity);
    }
}
