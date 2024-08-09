package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private Instant creationTime;

    protected Portfolio(){

    }

    public Portfolio(Client client, Instant creationTime){
        this.client = client;
        this.creationTime = creationTime;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Instant getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Instant creationTime) {
        this.creationTime = creationTime;
    }
}
