package com.example.chess_strategy.RestController;

import com.example.chess_strategy.Repository.FenRepository;
import com.example.chess_strategy.model.fenPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChessController {

    @Autowired
    private FenRepository repository;



    @GetMapping("/openings")
    public List<fenPosition> getAllOpenings() {
        return repository.findAll();
    }

    @GetMapping("/openings/{id}")
    public fenPosition getOpeningById(@PathVariable String id) {
        return repository.findById(id).get();
    }
}
