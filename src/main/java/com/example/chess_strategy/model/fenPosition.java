package com.example.chess_strategy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "strategie")
public class fenPosition {
    @Id
    private String id;
    private String name;
    private String fen;

    private List<String> moves;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getFen() {
        return fen;
    }

    public List<String> getMoves() {
        return moves;
    }

    public void setMoves(List<String> movesS) {
        this.moves = movesS;
    }

    public void setFen(String fen) {
        this.fen = fen;
    }
}
