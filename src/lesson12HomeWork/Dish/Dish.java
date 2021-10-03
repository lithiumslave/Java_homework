package lesson12HomeWork.Dish;

public enum Dish {
    BEEF_BURGER("Beef burger", 300, 30) {
        public void ingredients() {
            System.out.println("Beef Steak Mince, Cheddar, lettuce leaves, tomato, sauce");
        }
    },
    RIBEYE_STAKE("Ribeye stake", 320, 35) {
        public void ingredients() {
            System.out.println("Bone-in ribeye steak, oil, butter, rosemary");
        }
        public String getCategory() {
            return "Meat Dish";
        }
    },
    ROAST_BEEF("Beef roast", 220, 40) {
        public void ingredients() {
            System.out.println("Topside of beef, onion, celery, oil, salt, pepper");
        }
        public String getCategory() {
            return "Meat Dish";
        }
    },
    TIRAMISU("Tiramisu", 70, 50) {
        public void ingredients() {
            System.out.println("Egg yolks, sugar, milk, heavy cream, vanilla, coffee");
        }
        public String getCategory() {
            return "Dessert";
        }
    },
    APPLE_PIE("Apple pie", 40, 40) {
        public void ingredients() {
            System.out.println("Bought in Silpo, lol ;)");
        }
        public String getCategory() {
            return "Dessert";
        }
    };

    private String name;
    private int price;
    private int preparationTime;

    Dish(String name, int price, int preparationTime) {
        this.name = name;
        this.price = price;
        this.preparationTime = preparationTime;
    }

    public abstract void ingredients();

    public String getCategory() {
        return "Main Dish";
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }
}
