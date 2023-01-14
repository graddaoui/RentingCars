package com.ghassen.rent.car.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date reservationDate;

    @Column
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date startDate;

    @Column
    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date endDate;

    @ManyToMany(mappedBy = "reservationMade")
    private Set<Vehicule> reservedVehicules = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "client_id",referencedColumnName = "id")
    private Client client;

    public Reservation(){
    }

    public Reservation(Long id, Date reservationDate, Date startDate, Date endDate, Set<Vehicule> reservedVehicules, Client client) {
        this.id = id;
        this.reservationDate = reservationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reservedVehicules = reservedVehicules;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Set<Vehicule> getReservedVehicules() {
        return reservedVehicules;
    }

    public void setReservedVehicules(Set<Vehicule> reservedVehicules) {
        this.reservedVehicules = reservedVehicules;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
