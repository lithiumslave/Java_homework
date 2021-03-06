package lesson12HomeWork.Clothes;

public class Atelier {

    public void dressMan(Clothes[] clothes) {
        System.out.println("Hello! I will dress a MAN now!\n");
        for (Clothes cloth: clothes) {
            if (cloth instanceof MensClothing) {
                getClothesInfo(cloth);
            }
        }
    }

    public void dressWoman(Clothes[] clothes) {
        System.out.println("Hello! I will dress a WOMAN now!\n");
        for (Clothes cloth: clothes) {
            if (cloth instanceof WomansClothing) {
                getClothesInfo(cloth);
            }
        }
    }

    public void getClothesInfo(Clothes cloth) {
        System.out.println(cloth.getName());
        cloth.selectedSizeInfo();
        System.out.println("Cost: " + cloth.getPrice() + " UAH");
        System.out.println("Color: " + cloth.getColor());
        System.out.println();
    }
}
