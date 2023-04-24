import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int weight;
        int height;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите вес, кг");
        weight = scan.nextInt();
        System.out.println("Введите рост, см");
        height = scan.nextInt();
        BMI b = new BMI();
        b.calculatingBMI(weight, height);
    }
}