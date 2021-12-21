package com.vmarinov.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "euro_standard", schema = "cars")
public class EuroStandard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "type", columnDefinition = "varchar(45)", nullable = false)
    private String type;

    public EuroStandard() {
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
        return "EuroStandard{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
