import java.util.Scanner;

public class OfficialLecturer extends  Lecturer{
    private double salary; //lương thỏa thuận
    private static final int hourGeneralPerMonth=40; // số giờ quy định trong tháng
    public OfficialLecturer() {

    }
    public OfficialLecturer(String name, String email, String address, String phone, float teachingHourPerMonth,double wageAgreement) {
        super(name, email, address, phone, teachingHourPerMonth);
        this.salary =wageAgreement;
    }

    @Override
    public void inputInforLecturer() {
        super.inputInforLecturer();
        Scanner sc=new Scanner(System.in);
        System.out.print("Input wage Agreement: ");
        this.salary =sc.nextDouble();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OfficialLecturer{");
        super.getLecString(sb);
        sb.append(", salary=").append(salary);
        sb.append(", hourGeneralPerMonth=").append(hourGeneralPerMonth);
        sb.append('}');
        return sb.toString();
    }
    //Nhap ds giao vien co huu
    public static OfficialLecturer[] InputListOfLec(int n) {
        Scanner sc = new Scanner(System.in);
        OfficialLecturer[] list = new OfficialLecturer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Lecture " + (i + 1) + ": ");
            list[i] = new OfficialLecturer();
            list[i].inputInforLecturer();
        }
        return list;
    }

    //In danh sach giao vien co huu
    public static void printListOfLec(OfficialLecturer[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Official Lecture " + (i + 1));
            System.out.println(list[i].toString());
        }
    }
//    public int SumSalary (){
////        int bonus=this.teachingHourPerMonth>this.
//    }
}
