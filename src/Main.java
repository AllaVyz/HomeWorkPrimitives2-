public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int addition = 1700;
        int bonus;

        if (addition >=1000) {
            bonus = addition / 100;
            System.out.println(balance + addition + bonus);
        } else {
            System.out.println(balance + addition);
        }
    }
}