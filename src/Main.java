import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int weight;
        int height;
        double bmi;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите вес");
        weight = scan.nextInt();
        System.out.println("Введите рост");
        height = scan.nextInt();

        bmi = weight / ((height * 0.01) * (height * 0.01));
        System.out.println(bmi);

        if (bmi <= 16) {
            System.out.println("Выраженный дефицит веса");
        } else if (bmi > 16 && bmi < 17.9) {
            System.out.println("Недостаток массы тела");
        } else if (bmi > 18 && bmi < 24.9) {
            System.out.println("Норма");
        } else if (bmi > 25 && bmi < 29.9) {
            System.out.println("Чрезмерная масса тела");
        } else if (bmi > 30) {
            System.out.println("Ожирение");
        }
    }
}