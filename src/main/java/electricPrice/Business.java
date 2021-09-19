package electricPrice;

import java.util.Scanner;

public class Business extends Customer {
    protected int normalHour, lowHour, highHour;

    public int getNormalHour() {
        return normalHour;
    }

    public int getLowHour() {
        return lowHour;
    }

    public int getHighHour() {
        return highHour;
    }

    @Override
    public double calcBill() {
        return 0;
    }

    @Override
    public void inputCus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dien tieu thu gio binh thuong: ");
        this.normalHour = sc.nextInt();
        System.out.print("Nhap so dien tieu thu gio thap diem: ");
        this.lowHour = sc.nextInt();
        System.out.print("Nhap so dien tieu thu gio cao diem: ");
        this.highHour = sc.nextInt();

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Business{");
        sb.append("normalHour=").append(normalHour);
        sb.append(", lowHour=").append(lowHour);
        sb.append(", highHour=").append(highHour);
        sb.append('}');
        return sb.toString();
    }
}
