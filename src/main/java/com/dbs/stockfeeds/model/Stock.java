package com.dbs.stockfeeds.model;


import java.time.Instant;

public class Stock {
    private String symbol;
    private Double bid;
    private Double ask;
    private Instant event;

    public Stock() {

    }

    public Stock(String symbol, Double bid, Double ask, Instant event) {
        this.symbol = symbol;
        this.bid = bid;
        this.ask = ask;
        this.event = event;
    }

    public Stock(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public Double getAsk() {
        return ask;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public Instant getEvent() {
        return event;
    }

    public void setEvent(Instant event) {
        this.event = event;
    }
}