package org.dimigo.oop;

public class GameTest {
    public static void main(String[] args) {
        MediaPlayer mp = MediaPlayer.getInstance();
        System.out.println(mp.getVolume()); // 0

        new Player().play();
        System.out.println(mp.getVolume()); // 10

        new Enemy().play();
        System.out.println(mp.getVolume()); // 200
    }
}
