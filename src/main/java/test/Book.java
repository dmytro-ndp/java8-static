package test;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public static Book create(String title) {
        return new Book(title);
    }
}
