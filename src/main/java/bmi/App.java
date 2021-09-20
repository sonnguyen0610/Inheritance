package bmi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dcf = new DecimalFormat("#.##");
        System.out.print("Nhap can nang: ");
        double w = sc.nextDouble();
        if (w <= 0 || w > 300) {
            throw new Validation("Can nang khong hop le");
        }
        System.out.print("Nhap chieu cao: ");
        double h = sc.nextDouble();
        if (h <= 0 || h > 3) {
            throw new Validation("Chieu cao khong hop le");
        }
        try {
            double bmi = BMI.calculateBMI(w, h);
            System.out.println("BMI = " + dcf.format(bmi));
            if (bmi < 18) {
                System.out.println("Nguoi gay");
            } else if (bmi >= 18 && bmi <= 24.9) {
                System.out.println("Nguoi binh thuong");
            } else if (bmi >= 25 && bmi <= 29.9) {
                System.out.println("Nguoi beo phi cap do 1");
            } else if (bmi >= 30 && bmi <= 34.9) {
                System.out.println("Nguoi beo phi cap do 2");
            } else if (bmi >= 35) {
                System.out.println("Nguoi beo phi cap do 3");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
