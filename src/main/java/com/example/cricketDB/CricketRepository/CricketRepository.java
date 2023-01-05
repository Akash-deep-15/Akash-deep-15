package com.example.cricketDB.CricketRepository;

import com.example.cricketDB.ModelLayer.CricketPlayer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CricketRepository extends JpaRepository<CricketPlayer, Integer> {

     CricketPlayer findByJerseyNumber(int id);
}
