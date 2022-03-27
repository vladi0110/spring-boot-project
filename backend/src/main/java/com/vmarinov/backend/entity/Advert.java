package com.vmarinov.backend.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "advert", schema = "cars")
public class Advert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "make", columnDefinition = "varchar(100)", nullable = false)
    private String make;

    @Column(name = "model", columnDefinition = "varchar(100)", nullable = false)
    private String model;

    @Column(name = "year", columnDefinition = "int", nullable = false)
    private int year;

    @Column(name = "hp", columnDefinition = "int", nullable = false)
    private int horsePower;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "engine_type_id", nullable = false)
    private EngineType engineType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_id", nullable = false)
    private Type type;

    @Column(name = "mileage", columnDefinition = "int", nullable = false)
    private int mileage;

    @Column(name = "price", columnDefinition = "int", nullable = false)
    private int price;

    @Column(name = "color", columnDefinition = "varchar(100)", nullable = false)
    private String color;

    @Column(name = "vin", columnDefinition = "varchar(30)")
    private String vin;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "transmission_id", nullable = false)
    private Transmission transmission;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "euro_standard_id", nullable = false)
    private EuroStandard euroStandard;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "created", columnDefinition = "datetime", nullable = false)
    private LocalDateTime created;

    @Column(name = "validity", columnDefinition = "int", nullable = false)
    private int validity;

    @Column(name = "is_valid", columnDefinition = "BIT", nullable = false)
    private boolean isValid;

    @Column(name = "location", columnDefinition = "varchar(50)")
    private String location;

    @Column(name = "additional_info", columnDefinition = "blob")
    private String additionalInfo;

    @OneToMany(mappedBy = "advert", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Picture> pictures;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "advert_to_specification",
            joinColumns = @JoinColumn(name = "advert_id"),
            inverseJoinColumns = @JoinColumn(name = "specification_id"))
    private Set<Specification> specifications;

    public Advert() {
    }

    public Advert(int id, String make, String model, int year, int horsePower, EngineType engineType, Type type, int mileage, int price, String color, String vin, Transmission transmission, EuroStandard euroStandard, User user, LocalDateTime created, int validity, boolean isValid, String location, String additionalInfo, List<Picture> pictures, Set<Specification> specifications) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.horsePower = horsePower;
        this.engineType = engineType;
        this.type = type;
        this.mileage = mileage;
        this.price = price;
        this.color = color;
        this.vin = vin;
        this.transmission = transmission;
        this.euroStandard = euroStandard;
        this.user = user;
        this.created = created;
        this.validity = validity;
        this.isValid = isValid;
        this.location = location;
        this.additionalInfo = additionalInfo;
        this.pictures = pictures;
        this.specifications = specifications;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", horsePower=" + horsePower +
                ", engineType=" + engineType +
                ", type=" + type +
                ", mileage=" + mileage +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", vin='" + vin + '\'' +
                ", transmission=" + transmission +
                ", euroStandard=" + euroStandard +
                ", user=" + user +
                ", created=" + created +
                ", validity=" + validity +
                ", isValid=" + isValid +
                ", location='" + location + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", pictures=" + pictures +
                ", specifications=" + specifications +
                '}';
    }
}
