package muaDat;

import java.util.Scanner;

public class HinhChuNhat extends InforDat {
    public HinhChuNhat() {
    }

    public HinhChuNhat(int chieuDai, int chieuRong, int point) {
        super(chieuDai, chieuRong, point);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HinhChuNhat{");
        sb.append("chieuDai=").append(chieuDai);
        sb.append(", chieuRong=").append(chieuRong);
        sb.append(", diemTraiTren=").append(point);
        sb.append(" ,giaDat=").append(gia);
        sb.append('}');
        return sb.toString();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        this.chieuDai = sc.nextInt();
        System.out.print("Nhap chieu rong: ");
        this.chieuRong = sc.nextInt();
        System.out.print("Nhap diem trai tren: ");
        this.point = sc.nextInt();
        System.out.print("Nhap gia dat");
        int gia1m = sc.nextInt();
        this.gia = chieuDai * chieuRong * gia1m;
    }
}
