package lesson9ClassWork;

public class PhoneMain {
    public static void main(String[] args) {
        Phone iPhone = new Phone("+380935444234", "10Pro", 100);
        Phone samsung = new Phone("+380654889628", "GalaxyS20");
        Phone xiaomi = new Phone();

        System.out.println(iPhone.getNumber());
        System.out.println(samsung.getNumber());

        iPhone.receiveCall("Peter");
        samsung.sendMessage("Jane", "+39023583058032");

        iPhone.sendMessage("24", "155", "16");

        System.out.println(iPhone.toString());
        System.out.println(samsung.toString());
        System.out.println(xiaomi.toString());
    }
}
