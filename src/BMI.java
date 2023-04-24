public class BMI {
    public void calculatingBMI(int weight, int height) {
        double bmi;
        bmi = weight / ((height * 0.01) * (height * 0.01));
        System.out.println(bmi);
        if (bmi <= 16) {
            System.out.println("У вас выраженный дефицит веса");
        } else if (bmi > 16 && bmi < 17.9) {
            System.out.println("У вас недостаток массы тела");
        } else if (bmi > 18 && bmi < 24.9) {
            System.out.println("Ваш вес в норме!!");
        } else if (bmi > 25 && bmi < 29.9) {
            System.out.println("У вас чрезмерная масса тела");
        } else if (bmi > 30) {
            System.out.println("У вас ожирение");
        }
    }
}
