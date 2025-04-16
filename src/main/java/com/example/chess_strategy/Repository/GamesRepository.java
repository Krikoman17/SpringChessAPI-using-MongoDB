package com.example.chess_strategy.Repository;

import com.example.chess_strategy.model.Games;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GamesRepository extends MongoRepository<Games, String> {

}
