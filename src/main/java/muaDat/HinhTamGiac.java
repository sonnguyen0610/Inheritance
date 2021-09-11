package muaDat;

import java.util.Scanner;

public class HinhTamGiac extends InforDat {
    private int point1, point2;

    public HinhTamGiac() {
    }

    public HinhTamGiac(int point, int point1, int point2) {
        super(point);
        this.point1 = point1;
        this.point2 = point2;
    }

    public double chuVi() {
        int result = 0;
        result += this.point1 + this.point2 + this.point;
        return result;
    }

    public double area() {
        double dt;
        double p = chuVi() / 2;
        dt = Math.sqrt(p * (p - this.point1) * (p - this.point2) * (p - this.point));
        return dt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HinhTamGiac{");
        sb.append("point1=").append(point1);
        sb.append(", point2=").append(point2);
        sb.append(", point3=").append(point);
        sb.append(" ,giaDat=").append(gia);
        sb.append('}');
        return sb.toString();
    }

    public int giaDat(int gia1m) {
        return (int) (gia1m * area());
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap dinh 1: ");
        this.point1 = sc.nextInt();
        System.out.print("Nhap dinh 2: ");
        this.point2 = sc.nextInt();
        System.out.print("Nhap dinh 3: ");
        this.point = sc.nextInt();
        System.out.print("Nhap gia dat");
        int gia1m = sc.nextInt();
        this.gia = giaDat(gia1m);
    }
}
