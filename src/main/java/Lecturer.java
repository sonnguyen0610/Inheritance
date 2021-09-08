public class Lecturer {
    private String Name;
    private String email;
    private String address;
    private float phone;
    private float teachingHourPerMonth;

    public Lecturer(String name, String email, String address, float phone, float teachingHourPerMonth) {
        Name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.teachingHourPerMonth = teachingHourPerMonth;
    }

    public Lecturer() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getPhone() {
        return phone;
    }

    public void setPhone(float phone) {
        this.phone = phone;
    }

    public float getTeachingHourPerMonth() {
        return teachingHourPerMonth;
    }

    public void setTeachingHourPerMonth(float teachingHourPerMonth) {
        this.teachingHourPerMonth = teachingHourPerMonth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lecturer{");
        sb.append("Name='").append(Name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phone=").append(phone);
        sb.append(", teachingHourPerMonth=").append(teachingHourPerMonth);
        sb.append('}');
        return sb.toString();
    }

    public void inputInforLecturers() {

    }
    public void sumSalaryAll(){

    }
    public void findTypeLec_MaxSumSalary(){

    }
}
