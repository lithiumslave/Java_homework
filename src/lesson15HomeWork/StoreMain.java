package lesson15HomeWork;

import lesson5HomeWorkCombined.PrintOperations;

import java.util.Map;

public class StoreMain {
    public static void main(String[] args) {
        Store store = new Store();

        Map<String, Double> goods = store.convertEnumToMap();
        store.printGoods(goods);

        PrintOperations.printSeparator();

        store.applyDiscountToGoods(goods);
        store.printGoods(goods);
    }
}
