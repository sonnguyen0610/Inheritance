import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int slViLec=sc.nextInt();
        //Nhập danh sách thông tin giảng viên thỉnh giảng
        VisitingLecturer[] inputViLec=VisitingLecturer.InputListViLec(slViLec);
        //Xuất danh sách thông tin giảng viên thỉnh giảng
        VisitingLecturer.printListViLec(inputViLec);

        int slOfLec=sc.nextInt();
        //Nhập danh sách thông tin giảng viên cơ hữu
        OfficialLecturer[] inputOfLec=OfficialLecturer.InputListOfLec(slOfLec);
        //Xuất danh sách thông tin giảng viên cơ hữu
        OfficialLecturer.printListOfLec(inputOfLec);

        int slAllLec=sc.nextInt();
        //Xuất danh sách thông tin toàn bộ giảng viên
        Lecturer.printListLec(inputViLec,inputOfLec);

    }
}
