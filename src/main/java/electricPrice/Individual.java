package electricPrice;

import java.util.Scanner;

public class Individual extends Customer {
    private int prev;
    private int current;

    public int total_kWh() {
        return this.current - this.prev;
    }

    @Override
    public double calcBill() {
        return 0;
    }

    public void inputCus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dau thang: ");
        this.prev = sc.nextInt();
        System.out.print("Nhap so cuoi thang: ");
        this.current = sc.nextInt();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Individual{");
        sb.append("prev=").append(prev);
        sb.append(", current=").append(current);
        sb.append('}');
        return sb.toString();
    }
}
