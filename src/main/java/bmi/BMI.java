package bmi;

public class BMI {
    public static double calculateBMI(double w, double h) {
        return w / Math.pow(h, 2);
    }
}
