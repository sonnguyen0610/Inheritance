import java.util.Scanner;

public class Lecturer {
    protected String name;
    protected String email;
    protected String address;
    protected String phone;
    protected float teachingHourPerMonth;//so giờ làm trong 1 tháng

    public Lecturer(String name, String email, String address, String phone, float teachingHourPerMonth) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.teachingHourPerMonth = teachingHourPerMonth;
    }

    public Lecturer() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lecturer{");
        sb.append("Name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phone=").append(phone);
        sb.append(", teachingHourPerMonth=").append(teachingHourPerMonth);
        sb.append('}');
        return sb.toString();
    }

    public void inputInforLecturers() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input Name:");
        this.name=sc.nextLine();
        System.out.print("Input email:");
        this.email= sc.nextLine();
        System.out.print("Input address:");
        this.address= sc.nextLine();
        System.out.print("Input phone:");
        this.phone=sc.nextLine();
        System.out.print("Input number of teaching hours per month:");
        this.teachingHourPerMonth=sc.nextFloat();
    }
    //In danh sach giao vien
    public static void printListLec(VisitingLecturer[] listVisiting, OfficialLecturer[]listOfficial) {
        for (int i = 0; i < listVisiting.length; i++) {
            System.out.println("Visiting Lecture " + (i + 1));
            System.out.println(listVisiting[i].toString());
        }
        for (int i = 0; i < listOfficial.length; i++) {
            System.out.println("Official Lecture " + (i + 1));
            System.out.println(listOfficial[i].toString());
        }
    }
}
