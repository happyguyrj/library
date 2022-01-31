package com.example.application.dataStructures.queue.linkedListQueue;

import java.util.Objects;

public class Player {

    private int rank;
    private String name;

    public Player(int rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "rank=" + rank +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Player){
            Player player = (Player)o;
            return rank == player.rank && Objects.equals(name, player.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = rank;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
