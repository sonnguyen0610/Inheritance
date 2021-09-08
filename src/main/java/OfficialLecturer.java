public class OfficialLecturer extends  Lecturer{
    private double wageAgreement; //lương thỏa thuận
    private int hourGeneralPerMonth; // số giờ quy định trong tháng

    public OfficialLecturer(String name, String email, String address, float phone, float teachingHourPerMonth,double wageAgreement,int hourGeneralPerMonth) {
        super(name, email, address, phone, teachingHourPerMonth);
        this.wageAgreement=wageAgreement;
        this.hourGeneralPerMonth=hourGeneralPerMonth;
    }
}
