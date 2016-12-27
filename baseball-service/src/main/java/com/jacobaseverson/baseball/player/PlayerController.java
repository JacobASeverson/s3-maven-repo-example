package com.jacobaseverson.baseball.player;

import com.jacobaseverson.player.Player;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PlayerController {

    @RequestMapping("/players")
    public List<Player> listPlayers() {
        return Arrays.asList(new Player("Byron", "Buxton"), new Player("Max", "Kepler"));
    }

}
