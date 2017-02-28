package test;

public class App
{
    public static void main(String... args) {
        Book book1 = new Book("java");
        Book book2 = Book.create("java");
    }
}
