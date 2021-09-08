public class VisitingLecturer extends Lecturer {
    private String workPlace;// cơ quan lam viec

    public VisitingLecturer(String name, String email, String address, float phone, float teachingHourPerMonth,String workPlace) {
        super(name, email, address, phone, teachingHourPerMonth);
        this.workPlace=workPlace;
    }

}
