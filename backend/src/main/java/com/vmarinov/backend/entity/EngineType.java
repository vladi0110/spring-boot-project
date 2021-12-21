package com.vmarinov.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "engine_type", schema = "cars")
public class EngineType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "type", columnDefinition = "varchar(45)", nullable = false)
    private String type;

    public EngineType() {
    }

    public EngineType(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "EngineType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
