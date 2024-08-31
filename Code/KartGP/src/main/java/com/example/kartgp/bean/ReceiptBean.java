package com.example.kartgp.bean;

import java.time.LocalDate;

public class ReceiptBean {
    private LocalDate date;
    private int idSubscription;
    private int idDriver;
    private int idTournament;

    public ReceiptBean() {
    }

    public ReceiptBean(LocalDate date, int idSubscription, int idDriver, int idTournament) {
        this.date = date;
        this.idSubscription = idSubscription;
        this.idDriver = idDriver;
        this.idTournament = idTournament;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getIdSubscription() {
        return idSubscription;
    }

    public void setIdSubscription(int idSubscription) {
        this.idSubscription = idSubscription;
    }

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    public int getIdTournament() {
        return idTournament;
    }

    public void setIdTournament(int idTournament) {
        this.idTournament = idTournament;
    }
}
