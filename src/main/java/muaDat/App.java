package muaDat;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        InforDat[] inforDat = {
//                new HinhChuNhat(20, 30, 2),
//                new HinhVuong(30, 3),
//                new HinhTron(1, 10),
//                new HinhTamGiac(4, 5, 6)
//        };
//        for (InforDat list : inforDat) {
//            System.out.println(list);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1: Them tt manh dat hcn\n" +
                "Nhap 2:Them tt manh dat hinh vuong\n" +
                "Nhap 3: Them tt manh dat hinh tron\n" +
                "Nhap 4: Them tt manh dat hinh tam giac");
        int option = sc.nextInt();
        if (option == 1) {
            InforDat cn = new HinhChuNhat();
            cn.input();
            System.out.println(cn.toString());
        } else if (option == 2) {
            InforDat vuong = new HinhVuong();
            vuong.input();
            System.out.println(vuong.toString());
        } else if (option == 3) {
            InforDat tron = new HinhTron();
            tron.input();
            System.out.println(tron.toString());
        } else if (option == 4) {
            InforDat tamGiac = new HinhTamGiac();
            tamGiac.input();
            System.out.println(tamGiac.toString());
        } else {
            System.out.println("Nhap lua chon k dung");
        }
    }
}
