package com.ghassen.rent.car.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String type;
    @Column
    private String mark;
    @Column
    private Integer nbSeats;
    @Column
    private String engineType;
    @Column
    private Integer nbHorses;
    @Column
    private Double price;

    @ManyToMany
    @JoinTable(
            name = "vehicule_reservation",
            joinColumns = @JoinColumn(name = "vehicule_id"),
            inverseJoinColumns = @JoinColumn(name = "reservation_id")
    )
    private Set<Reservation> reservationMade = new HashSet<>();

    public Vehicule(){}

    public Set<Reservation> getReservationMade() {
        return reservationMade;
    }

    public void setReservationMade(Set<Reservation> reservationMade) {
        this.reservationMade = reservationMade;
    }

    public Vehicule(Long id, String type, String mark, Integer nbSeats, String engineType, Integer nbHorses, Double price) {
        this.id = id;
        this.type = type;
        this.mark = mark;
        this.nbSeats = nbSeats;
        this.engineType = engineType;
        this.nbHorses = nbHorses;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNbSeats() {
        return nbSeats;
    }

    public void setNbSeats(Integer nbSeats) {
        this.nbSeats = nbSeats;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public Integer getNbHorses() {
        return nbHorses;
    }

    public void setNbHorses(Integer nbHorses) {
        this.nbHorses = nbHorses;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Commercial{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", nbSeats=" + nbSeats +
                ", engineType='" + engineType + '\'' +
                ", nbHorses=" + nbHorses +
                ", price=" + price +
                '}';
    }
}
