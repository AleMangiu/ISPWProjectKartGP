package com.example.kartgp.entity;

import java.time.LocalDate;

public class Receipt {
    private int idReceipt;
    private LocalDate date;
    private int idSubscriptionEntity;
    private int idDriverEntity;
    private int idTournamentEntity;

    public Receipt() {
    }

    public Receipt(LocalDate date, int idDriverEntity, int idTournamentEntity) {

        this.date = date;
        this.idDriverEntity = idDriverEntity;
        this.idTournamentEntity = idTournamentEntity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getIdSubscriptionEntity() {
        return idSubscriptionEntity;
    }

    public void setIdSubscriptionEntity(int idSubscriptionEntity) {
        this.idSubscriptionEntity = idSubscriptionEntity;
    }

    public int getIdDriverEntity() {
        return idDriverEntity;
    }

    public void setIdDriverEntity(int idDriverEntity) {
        this.idDriverEntity = idDriverEntity;
    }

    public int getIdTournamentEntity() {
        return idTournamentEntity;
    }

    public void setIdTournamentEntity(int idTournamentEntity) {
        this.idTournamentEntity = idTournamentEntity;
    }
}
