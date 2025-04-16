package com.example.chess_strategy.RestController;

import com.example.chess_strategy.Repository.GamesRepository;
import com.example.chess_strategy.model.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chess")
public class GamesController {
    @Autowired
    private GamesRepository repository;

    @GetMapping("/games")
    public List<Games> getAllGames() {
        return repository.findAll();
    }
    @GetMapping("/games/{id}")
    public Games getGameById(@PathVariable String id) {
        return repository.findById(id).get();
    }
}
