package com.example.application.dataStructures.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    static Queue<Integer> queue = new PriorityQueue<>();
    static Queue<Player> players = new PriorityQueue<>(new PlayerSort());

    public static void main(String[] args) {
        pushAndPrint(100, false);
        pushAndPrint(10, false);
        pushAndPrint(5, false);
        pushAndPrint(50, false);
        pushAndPrint(10, true);
        pushAndPrint(5, true);
        pushAndPrint(5, true);

        pushAndPrint(new Player(10, "Rahul Jain"), false);
        pushAndPrint(new Player(4, "Mr Jain"), false);
        pushAndPrint(new Player(9, "Jain"), false);
        pushAndPrint(new Player(3, "Rahul"), false);
        pushAndPrint(new Player(2, "Rahul J."), false);
        pushAndPrint(new Player(3, "Rahul"), true);
        pushAndPrint(new Player(2, "Rahul J."), true);
    }

    public static void pushAndPrint(Integer integer, boolean remove) {
        if (remove)
            queue.remove(integer);
        else
            queue.add(integer);
        System.out.println(queue.peek());
    }

    public static void pushAndPrint(Player player, boolean remove) {
        if (remove)
            players.remove(player);
        else
            players.add(player);
        System.out.println(players.peek().toString());
    }
}
