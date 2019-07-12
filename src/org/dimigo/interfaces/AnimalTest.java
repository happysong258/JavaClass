package org.dimigo.interfaces;

public class AnimalTest {
    public static void main(String[] args) {
        // IAnimal.FARM_NAME = "디문 동물농장"; 상수이기 때문에 바꾸지 못한다.
        IAnimal.welcome();

        IAnimal[] animals = {
                new Dog(), new Cat()
        };
        for(IAnimal a : animals) {
            a.eat();
            a.sleep();
            a.bark();
        }
    }
}
