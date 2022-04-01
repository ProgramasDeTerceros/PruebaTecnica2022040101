package com.homecenter.almacen.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Almacen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_almacen",nullable = false,unique = true)
    private Long id;
    //nombre
    @Column(length = 50)
    private String name;
    //fecha de inaguracion
    private LocalDate dateInaguration;
    //capacidad de clientes
    private int clientCapacity;

    public Almacen( String name, LocalDate dateInaguration, int clientCapacity) {
        this.name = name;
        this.dateInaguration = dateInaguration;
        this.clientCapacity = clientCapacity;
    }
    public Almacen(Long id) {
        this.id = id;
    }
    public Almacen() {
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

    public LocalDate getDateInaguration() {
        return dateInaguration;
    }

    public void setDateInaguration(LocalDate dateConfig) {
        this.dateInaguration = dateConfig;
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
                ", dateConfig=" + dateInaguration +
                ", clientCapacity=" + clientCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Almacen almacen = (Almacen) o;
        return clientCapacity == almacen.clientCapacity && Objects.equals(id, almacen.id) && Objects.equals(name, almacen.name) && Objects.equals(dateInaguration, almacen.dateInaguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, dateInaguration, clientCapacity);
    }
}
