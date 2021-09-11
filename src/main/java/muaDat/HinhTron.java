package muaDat;

import java.util.Scanner;

public class HinhTron extends InforDat {
    private int banKinh;

    public HinhTron() {
    }

    public HinhTron(int point, int banKinh) {
        super(point);
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HinhTron{");
        sb.append("banKinh=").append(banKinh);
        sb.append(", tam=").append(point);
        sb.append(" ,giaDat=").append(gia);
        sb.append('}');
        return sb.toString();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tam: ");
        this.point = sc.nextInt();
        System.out.print("Nhap ban kinh: ");
        this.banKinh = sc.nextInt();
        System.out.print("Nhap gia dat");
        int gia1m = sc.nextInt();
        this.gia = (int) (gia1m * (banKinh + banKinh) * (banKinh + banKinh) * Math.PI);
    }

}
