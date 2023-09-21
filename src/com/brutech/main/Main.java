package com.brutech.main;

public class Main {
    public static void main(String[] args) {

       /* Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());*/

        Player pl = new Player("bru", 80, Player.Weapon.MACHINE_GUN);
        System.out.println(pl.healthRemaining());
        System.out.println(pl.loseHealth(90));
        System.out.println(pl.restoreHealth(110));
        System.out.println(pl.loseHealth(20));
        pl.loseHealth(20);
        System.out.println(pl);



    }
}