package lesson9HomeWork;

public class Book {
    private String nameOfBook;
    private String authorOfBook;

    public Book(String nameOfBook, String authorOfBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public String toStringBook() {
        return "название: '" + nameOfBook + '\'' +
                ", автор:  '" + authorOfBook + '\'';
    }
}
