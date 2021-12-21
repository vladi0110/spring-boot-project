package com.vmarinov.backend.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "specification", schema = "cars")
public class Specification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "category", columnDefinition = "varchar(100)", nullable = false)
    private String category;

    @Column(name = "name", columnDefinition = "varchar(200)", nullable = false)
    private String name;

    @ManyToMany(mappedBy = "specifications")
    private Set<Advert> adverts;

    public Specification() {
    }

    public Specification(int id, String category, String name, Set<Advert> adverts) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.adverts = adverts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Advert> getAdverts() {
        return adverts;
    }

    public void setAdverts(Set<Advert> adverts) {
        this.adverts = adverts;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", adverts=" + adverts +
                '}';
    }
}
