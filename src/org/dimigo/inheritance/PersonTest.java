package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("잔나비", 27, 180, 70);
        System.out.println(p);
        p.eat();
        p.sleep();

        Student s = new Student("강효은", 18, 165, 48,"2602");
        System.out.println(s);
        s.eat();
        s.sleep();
        s.rollCall();
        s.study();

        Teacher t = new Teacher("김종수", 48, 180, 70, "화학1");
        System.out.println(t);
        t.eat();
        t.sleep();
        t.doTask();
        t.teach();
    }
}
