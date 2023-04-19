
public class OfficeStaff extends Abstract{
    private String specialization;

    public OfficeStaff(String name, String id, String address, String gender, int age, String specialization) {
        super(name, id, address, gender, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    @Override
    public void CalculateEarning(){
        System.out.println("10,000 RS");
    }
    @Override
    public void OfficeHours(){
        System.out.println("Office hours : 7-2");
    }

    @Override
    public String toString() {
        return "OfficeStaff [name =" + getName() + ", id =" + getId() + ", address =" + getAddress() + ", gender =" + getGender() + ", age =" + getAge()+"Specialization =" +specialization + "]";
    }

    public void getDetail() {
        System.out.println("name =" + getName() + ", id =" + getId() + ", address =" + getAddress() + ", gender =" + getGender() + ", age =" + getAge()+"Specialization =" +specialization );
    }
    
}
