package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book;
        book = new Book();

        Book book2 = new Book();

        System.out.println(book);
        System.out.println(book2);
        // 실제 메모리 오픈x,=
        // 둘 다 다른 값이기 때문에 서로 다른 객체임

        System.out.println(book.getAuthor());
        System.out.println(book.getPage());
        System.out.println(book.getTitle());

        //System.out.println(book.title);
        //System.out.println(book.author);
        //System.out.println(book.page);
        // 에러가 안나는 이유는 public으로 했기 때문
        // 에러가 나는 이유는 private로 했기 때문

        book.setTitle("수학의 바이블2");
        System.out.println(book.getTitle());

        Book book3 = new Book("수학의 바이블", "김재영", 110);
    }
}
