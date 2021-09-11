package muaDat;

import java.util.Scanner;

public class InforDat {
    protected int chieuDai, chieuRong, point,gia;

    public InforDat() {
    }

    public InforDat(int chieuDai, int chieuRong, int point) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.point = point;
    }

    public InforDat(int chieuRong, int point) {
        this.chieuRong = chieuRong;
        this.point = point;
    }

    public InforDat(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("inforDat{");
        sb.append('}');
        return sb.toString();
    }
    public void input() {
    }
}
