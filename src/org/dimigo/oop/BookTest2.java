package org.dimigo.oop;

public class BookTest2 {

    private static void compare() {
        // 기본형
        int a = 10;
        int b = a;

        System.out.println(a == b ? "ture" : "false");

        //참조형
        Book book = new Book();
        Book book2 = book; //타입이 같으면 같은 값 가능

        System.out.println(book == book2 ? "true" : "false");

        book2.setTitle("능률보카");
        System.out.println(book.getTitle());
    }

    public static void main(String[] args) {
        compare();

        int num = 5;
        methodA(num);
        System.out.println(num); // 5

        Book book = new Book("수학의 바이블");
        methodB(book);
        System.out.println(book.getTitle()); // 수학의 바이블

        methodC(book);
        System.out.println(book.getTitle()); // 이것이 자바다

        Book book2 = new Book();
        System.out.println(book2.getTitle());
    }

    private static void methodC(Book book) {
        book.setTitle("이것이 자바다");
    }

    private static void methodB(Book book) {
        book = new Book("이것이 자바다");
        System.out.println(book.getTitle()); // 이것이 자바다
    }

    private static void methodA(int num) {
        num += 10;
        System.out.println(num); // 10
    }
}
