package lesson11HomeWork.Print;

public class Magazine implements Printable{
    private String paperType;
    private String name;

    public Magazine(String paperType, String name) {
        this.paperType = paperType;
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Need to print magazine with " + paperType + " type of paper");
    }

    static void printMagazines(Printable[] printable) {

    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }
}
