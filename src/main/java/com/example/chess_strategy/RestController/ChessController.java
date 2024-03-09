package com.example.chess_strategy.RestController;

import com.example.chess_strategy.Repository.FenRepository;
import com.example.chess_strategy.model.fenPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChessController {

    @Autowired
    private FenRepository repository;

//    @PostMapping("/saveOpening")
//    public fenPosition createOpening(@RequestBody fenPosition opening) {
//        return repository.save(opening);
//    }

    @GetMapping("/openings")
    public List<fenPosition> getAllOpenings() {
        return repository.findAll();
    }
}
