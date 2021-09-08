import java.util.Scanner;

public class VisitingLecturer extends Lecturer {
    private String workPlace;// cơ quan lam viec
    private static final double salaryPerHour = 200000;

    public VisitingLecturer() {
    }

    public VisitingLecturer(String name, String email, String address, String phone, float teachingHourPerMonth, String workPlace) {
        super(name, email, address, phone, teachingHourPerMonth);
        this.workPlace = workPlace;
    }

    //Nhap 1 giao vien thinh giang
    @Override
    public void inputInforLecturers() {
        super.inputInforLecturers();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input work place: ");
        this.workPlace = sc.nextLine();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VisitingLecturer{");
        sb.append("name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phone=").append(phone);
        sb.append(", teachingHourPerMonth=").append(teachingHourPerMonth);
        sb.append(", workPlace='").append(workPlace).append('\'');
        sb.append(", salary='").append(salaryPerHour).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //Nhap ds giao vien thinh giang
    public static VisitingLecturer[] InputListViLec(int n) {
        VisitingLecturer[] list = new VisitingLecturer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Lecture " + (i + 1) + ": ");
            list[i] = new VisitingLecturer();
            list[i].inputInforLecturers();
        }
        return list;
    }

    //In danh sach giao vien thinh giang
    public static void printListViLec(VisitingLecturer[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("Visiting Lecture " + (i + 1));
            System.out.println(list[i].toString());
        }
    }
}
