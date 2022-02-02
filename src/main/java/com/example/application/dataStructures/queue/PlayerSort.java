package com.example.application.dataStructures.queue;

import java.util.Comparator;

public class PlayerSort implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getRank() - o2.getRank();
    }
}
