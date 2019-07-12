package org.dimigo.oop;

public class Book {
    //필드
    private String title = "수학의 바이블"; // default값은 null
    private String author = "김재영";
    private int page = 100; // default값은 0

    // 기본생성자
    public Book() {
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book(String title) {
        this(title, "저자미상");
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPage() { return page; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPage(int page) { this.page = page; }
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page=" + page +
                '}';
    }
}
