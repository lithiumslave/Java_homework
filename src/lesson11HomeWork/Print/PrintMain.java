package lesson11HomeWork.Print;

import lesson5HomeWorkCombined.PrintOperations;

public class PrintMain {
    public static void main(String[] args) {
        Book harryP = new Book(600, "Harry Potter");
        Book witcher = new Book(400, "The Witcher");
        Book marvel = new Book(500, "Marvel comics");
        Magazine viva = new Magazine("uncoated", "Viva");
        Magazine playBoy = new Magazine("coated", "Play Boy");

        Printable[] prints = {harryP, witcher, marvel, viva, playBoy};

        for (Printable printable : prints) {
            printable.print();
        }

        PrintOperations.printSeparator();
        Book.printBooks(prints);

        PrintOperations.printSeparator();
        Magazine.printMagazine(prints);

    }
}
