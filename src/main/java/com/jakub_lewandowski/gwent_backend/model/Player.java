package com.jakub_lewandowski.gwent_backend.model;

public class Player {
    private long id;
    private String username;
    private int sprite;
    private int positionX;
    private int positionY;
    private int wins;
    private int losses;

    public Player() {}

    // Used to create a default player object (default starting location and W/L ratio)
    public Player(String username, int sprite) {
        this.username = username;
        this.sprite = sprite;
        this.positionX = 600;
        this.positionY = 310;
        this.wins = 0;
        this.losses = 0;
    }

    // Used to create player objects from the database
    public Player(long id, String username, int sprite, int positionX, int positionY, int wins, int losses) {
        this.id = id;
        this.username = username;
        this.sprite = sprite;
        this.positionX = positionX;
        this.positionY = positionY;
        this.wins = wins;
        this.losses = losses;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getSprite() {
        return sprite;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
}
