package org.dimigo.inheritance;

public class Animal {
    public Animal() {} // 객체를 만들 수 없지만 생성자는 만들 수 있다. 자식객체가 생성자를 사용할 때 부모의 생성자를 사용할 수 있기 때문

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("냠냠");
    }
    public void sleep() {
        System.out.println("쿨쿨");
    }
    public void bark() {
        System.out.println("멍멍");
    }
    public String toString() {
        return "제 이름은 " + name + "입니다.";
    }
}
