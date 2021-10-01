package lesson11HomeWork.Print;

public class PrinMain {
    public static void main(String[] args) {
        Book harryP = new Book(600, "Harry Potter");
        Book witcher = new Book(400, "The witcher");
        Book marvel = new Book(500, "Marvel comics");
        Magazine viva = new Magazine("uncoated", "Viva");
        Magazine playBoy = new Magazine("coated", "Play Boy");

        Printable[] prints = {harryP, witcher, marvel, viva, playBoy};

        for (Printable printable : prints) {
            printable.print();
        }

    }
}
