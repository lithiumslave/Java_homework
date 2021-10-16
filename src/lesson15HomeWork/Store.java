package lesson15HomeWork;

import java.util.HashMap;
import java.util.Map;

public class Store {
    private final double seasonalDiscount = 99.999;
    private Map<String, Double> goods;

    public Map<String, Double> convertEnumToMap() {
        goods = new HashMap<>();
        for (Goods good : Goods.values()) {
                goods.put(good.getName(), good.getPrice());
            }
        return goods;
    }

    public void printGoods(Map<String, Double> mapOfGoods) {
        for (Map.Entry<String, Double> entry : mapOfGoods.entrySet()) {
            System.out.println("Price of item " + entry.getKey() + " is " + entry.getValue() + " UAH");
        }
    }

    public Map<String, Double> applyDiscountToGoods(Map<String, Double> fullPriceGoods) {
        for (Map.Entry<String, Double> entry : fullPriceGoods.entrySet()) {
            entry.setValue(entry.getValue() - seasonalDiscount);
        }
        return fullPriceGoods;
    }
}
