package com.backontrack.initialbasiccourse.list.linkedlist.cannons;

import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Cannon> cannons = new LinkedList<>();

        cannons.add(new Cannon(1, true));
        cannons.add(new Cannon(2, false));
        cannons.add(new Cannon(3, true));
        cannons.add(new Cannon(4, false));
        cannons.add(new Cannon(5, false));

        cannons.forEach(Cannon::fire);

        for (Cannon cannon: cannons) {
            System.out.println("Cannon #" + cannon.getNumber());
            System.out.println(cannon.isLoaded());
        }
    }
}
