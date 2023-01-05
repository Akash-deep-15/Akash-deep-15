package com.example.cricketDB.CricketController;

import com.example.cricketDB.CricketService.CricketService;

import com.example.cricketDB.ModelLayer.CricketPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("cricket")
public class CricketController {

    @Autowired
    CricketService cricketService;

    @PostMapping("/addplayer")
    public ResponseEntity addPlayer(@RequestBody() CricketPlayer player) {
        cricketService.addPlayer(player);
        return new ResponseEntity("New player added",HttpStatus.OK);
    }

    @GetMapping("/getPlayer/{id}")
    public ResponseEntity<CricketPlayer> getPlayer(@PathVariable("id") int jerseyNumber)  {
         CricketPlayer player = cricketService.getPlayer(jerseyNumber);
        return new ResponseEntity(player, HttpStatus.OK);
    }

}
