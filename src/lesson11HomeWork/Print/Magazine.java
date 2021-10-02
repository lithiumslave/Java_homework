package lesson11HomeWork.Print;

public class Magazine implements Printable{
    private String paperType;
    private String name;

    public Magazine(String paperType, String name) {
        this.paperType = paperType;
        this.name = name;
    }

    static void printMagazine(Printable[] printable) {
        for (Printable printM : printable) {
            if (printM instanceof Magazine) {
                System.out.println(((Magazine) printM).getName());
            }
        }
    }

    @Override
    public void print() {
        System.out.println("Need to print magazine with " + paperType + " type of paper");
    }

    public String getName() {
        return name;
    }
}
