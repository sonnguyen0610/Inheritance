package muaDat;

import java.util.Scanner;

public class HinhVuong extends InforDat {
    public HinhVuong() {
    }

    public HinhVuong(int chieuRong, int point) {
        super(chieuRong, point);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HinhVuong{");
        sb.append("chieuRong=").append(chieuRong);
        sb.append(", diemTraiTren=").append(point);
        sb.append(" ,giaDat=").append(gia);
        sb.append('}');
        return sb.toString();
    }

    public int giaDat(int gia1m) {
        return gia1m * this.chieuRong * this.chieuRong;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu rong: ");
        this.chieuRong = sc.nextInt();
        System.out.print("Nhap diem trai tren: ");
        this.point = sc.nextInt();
        System.out.print("Nhap gia dat");
        int gia1m = sc.nextInt();
        this.gia = giaDat(gia1m);
    }
}
