package com.example.chess_strategy.model;

public class Players {
    private String white;
    private String black;

    // Constructor
    public Players(String white, String black) {
        this.white = white;
        this.black = black;
    }

    // Getters and Setters
    public String getWhite() {
        return white;
    }

    public void setWhite(String white) {
        this.white = white;
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black;
    }
}
