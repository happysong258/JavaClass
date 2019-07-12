package org.dimigo.oop2;

public class Car {
    // 정적필드
    public static String company;
    // 인스턴스필드
    private String name;

    // static block static초기화를 위해
    static {
        company = "기아";
        System.out.println("static block 호출");
    }

    public Car(String name) {
        System.out.println("constructor 호출");
        this.name = name;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return company + " : " + name;
    }
}
