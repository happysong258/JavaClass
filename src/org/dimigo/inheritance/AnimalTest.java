package org.dimigo.inheritance;

import java.lang.reflect.AnnotatedArrayType;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("아무개");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();

        Dog d = new Dog("멍멍이");
        System.out.println(d);
        d.wag();
        d.eat();
        d.sleep();
        d.bark();   //animal의 bark

        Cat c = new Cat("야옹이");
        System.out.println(c);
        c.bark();   //cat의 bark
        c.scatch();

        Tiger t = new Tiger("호돌이");
        System.out.println(t);
        t.bark();   //Tiger의 bark
        t.hunt();

        Animal[] animals = {
                new Dog("멍멍이"),
                new Cat("야옹이"),
                new Tiger("호돌이")
        };

        for(Animal animal : animals) {
            //System.out.println(animal);
            //animal.bark();
            doBark(animal);
        }

        Animal a2 = new Cat("야옹이");
        a2.eat();
        a2.sleep();
        a2.bark();
        // a2.scatch();
        ((Cat) a2).scatch();

        Cat c2 = (Cat) a2;
        c2.scatch();

        // Dog d2 = (Dog) a2; 런타임에러

        Animal dog = new Dog("멍멍이");
        Animal cat = new Cat("야옹이");

        System.out.println(dog instanceof Dog); // true
        System.out.println(cat instanceof Cat); // true
        System.out.println(dog instanceof Cat); // false
        System.out.println(cat instanceof Dog); // false
        System.out.println(dog instanceof Animal); // true
        System.out.println(cat instanceof Animal); // true

        doBark(dog);
        doBark(cat);

    }

    private static void doBark(Animal animal) {
        // System.out.println(animal);
        // animal.bark();
        if(animal instanceof Dog) {
            ((Dog) animal).wag();
        } else if(animal instanceof Cat) {
            ((Cat)animal).scatch();
        }
    }
}
