package org.dimigo.oop;

public class Person {
    private final String species = "포유류";
    private final String birthDate;
    private String name;
    public static final String SPECIES = "포유류";

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "species='" + species + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020518", "강효은");
        Person p2 = new Person("20020202", "아이유");
        System.out.println(p1);
        System.out.println(p2);


        // p1.species = "파충류";
        System.out.println(Person.SPECIES);
    }
}
