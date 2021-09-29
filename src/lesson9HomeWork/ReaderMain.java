package lesson9HomeWork;

import lesson5HomeWorkCombined.PrintOperations;
import lesson9HomeWork.Book;
import lesson9HomeWork.Reader;

public class ReaderMain {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Malyarchuck N. V.", 2, "ITS", "11.10.1993", "+380935555555");
        Reader reader2 = new Reader("Petrov A. V.", 4, "FEL", "12.10.1993", "+380936666666");
        Reader reader3 = new Reader("Muravei O. I.", 3, "IPSA", "13.10.1993", "+380937777777");
        // Reader[] readers = {reader1, reader2, reader3};
        // зачем делать массив?

        Book book1 = new Book("Harry Potter and the Deathly Hallows", "J. K. Rowling");
        Book book2 = new Book("The Call of Cthulhu", "H. P. Lovecraft");
        Book book3 = new Book("What Dreams May Come", "R. B. Matheson");
        Book book4 = new Book("A Christmas Carol", "Charles Dickens");
        Book book5 = new Book("Martin Eden", "Jack London");

        reader1.takeBook(3);
        PrintOperations.printSeparator();
        reader2.takeBook("Invisible Man", "War of the Worlds", "The Island of Doctor Moreau");
        PrintOperations.printSeparator();
        reader3.takeBook(book1, book2, book3);
        PrintOperations.printSeparator();

        reader1.returnBook(1);
        PrintOperations.printSeparator();
        reader2.returnBook("Winnie-the-Pooh", "Oliver Twist");
        PrintOperations.printSeparator();
        reader3.returnBook(book4, book5);

    }
}
