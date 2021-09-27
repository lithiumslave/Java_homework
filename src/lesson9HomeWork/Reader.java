package lesson9HomeWork;

import lesson9HomeWork.Book;

public class Reader {
    private String nameFull;
    private int cardNumber;
    private String faculty;
    private String birthDate;
    private String phone;

    public Reader(String nameFull, int cardNumber, String faculty, String birthDate, String phone) {
        this.nameFull = nameFull;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public void takeBook(int cardNumber) {
        if (cardNumber == 1) {
            System.out.println(this.nameFull + " взял 1 книгу");
        } else {
            System.out.println(this.nameFull + " взял " + cardNumber + " книги");
        }
    }

    public void takeBook(String... bk) {
        System.out.println(this.nameFull + " взял книги:");
        for (String book : bk) {
            System.out.println("   " + book);
        }
    }

    public void takeBook(Book... books) {
        System.out.println(this.nameFull + " взял книги:");
        for (Book book : books) {
            System.out.println("   " + book.toStringBook());
        }
    }

    public void returnBook(int cardNumber) {
        if (cardNumber == 1) {
            System.out.println(this.nameFull + " вернул 1 книгу");
        } else {
            System.out.println(this.nameFull + " вернул " + cardNumber + " книги");
        }
    }

    public void returnBook(String... bk) {
        System.out.println(this.nameFull + " вернул книги:");
        for (String book : bk) {
            System.out.println("   " + book);
        }
    }

    public void returnBook(Book... books) {
        System.out.println(this.nameFull + " вернул книги:");
        for (Book book : books) {
            System.out.println("   " + book.toStringBook());
        }
    }
}
