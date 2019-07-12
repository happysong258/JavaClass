package org.dimigo.oop;

public class Car {

    public Car() {
    }

    private int horsePower;
    private float fuelEfficiency;
    private int price;
    private String design;
    private String company;

    public void drive() {
        System.out.println("운전합니다");
    }

    public void turnRight(int angle) {
        System.out.println(angle + "도 우회전합니다");
    }

    public void turnLeft(int angle) {
        System.out.println(angle + "도 좌회전합니다");
    }

    public void lightOn() {
        System.out.println("라이트를 켭니다");
    }

    public boolean stop() {
        System.out.println("정지합니다");
        return true;
    }

}