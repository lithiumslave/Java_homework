package lesson13HomeWork;

public class Weather {

    static void isWeatherGood(boolean isItRaining, int temperature, boolean isItSunny) throws Exception {
        if (isItRaining && temperature < 10 && !isItSunny) {
                throw new Exception("Weather is not good");
            } else {
                System.out.println("Weather is good");
            }
    }

    public static void main(String[] args) throws Exception {
        isWeatherGood(false, 8, true);
        isWeatherGood(false, 16, true);
        isWeatherGood(true, 8, false);
    }
}
