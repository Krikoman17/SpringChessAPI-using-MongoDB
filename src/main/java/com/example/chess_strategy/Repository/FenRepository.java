package com.example.chess_strategy.Repository;

import com.example.chess_strategy.model.fenPosition;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FenRepository extends MongoRepository<fenPosition, String> {

}
