package com.vmarinov.backend.entity;

import javax.persistence.*;

@Entity
@Table(name = "picture", schema = "cars")
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "location", columnDefinition = "varchar(200)", nullable = false)
    private String location;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "advert_id", nullable = false)
    private Advert advert;

    public Picture() {
    }

    public Picture(int id, String location, Advert advert) {
        this.id = id;
        this.location = location;
        this.advert = advert;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Advert getAdvert() {
        return advert;
    }

    public void setAdvert(Advert advert) {
        this.advert = advert;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", advert=" + advert +
                '}';
    }
}
