
public class Teacher extends Abstract{
    private String graduation;

    public Teacher(String name, String id, String address, String gender, int age, String graduation) {
        super(name, id, address, gender, age);
        this.graduation = graduation;
    }
    

    @Override
    public void CalculateEarning(){
        System.out.println("20,000 RS");
    }
    @Override
    public void OfficeHours(){
        System.out.println("Office hours : 7am - 2pm");
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    @Override
    public String toString() {
        return "Teacher [name =" + getName() + ", id =" + getId() + ", address =" + getAddress() + ", gender =" + getGender() + ", age =" + getAge()+", Graduation =" +graduation  + "]";
    }
    public void getDetail() {
        System.out.println("name =" + getName() + ", id =" + getId() + ", address =" + getAddress() + ", gender =" + getGender() + ", age =" + getAge()+", Graduation =" +graduation );
    }
    
}
