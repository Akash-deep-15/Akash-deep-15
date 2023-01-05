package com.example.cricketDB.CricketService;

import com.example.cricketDB.CricketRepository.CricketRepository;
import com.example.cricketDB.ModelLayer.CricketPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CricketService {

    @Autowired
    CricketRepository cricketRepository;

    public void addPlayer(CricketPlayer player) {
        cricketRepository.save(player);
    }

    public CricketPlayer getPlayer(int id) {
        CricketPlayer player = cricketRepository.findByJerseyNumber(id);

        return player;
    }
}
