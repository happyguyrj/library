package com.example.application.dataStructures.queue.linkedListQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListQueueExample {

    static Queue<Integer> queue = new LinkedList<>() {};
    static Queue<Player> players = new PriorityQueue<>(new PlayerSort());

    public static void main(String[] args) {
        queue.add(1);
        queue.add(4);
        queue.add(3);
        System.out.println(queue);
        queue.offer(1);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);

        players.add(new Player(10, "Rahul Jain"));
        players.add(new Player(4, "Mr Jain"));
        players.add(new Player(9, "Jain"));
        players.add(new Player(3, "Rahul"));
        players.add(new Player(2, "Rahul J."));
        System.out.println(players);
        players.remove(new Player(3, "Rahul"));
        players.remove(new Player(2, "Rahul J."));
        System.out.println(players);
    }
}
