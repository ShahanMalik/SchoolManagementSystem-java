
public class Principal extends Abstract{
    private String graduation;

    public Principal(String name, String id, String address, String gender, int age, String graduation) {
        super(name, id, address, gender, age);
        this.graduation = graduation;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }

    @Override
    public void CalculateEarning() {
        System.out.println("50,000");
    }

    @Override
    public void OfficeHours() {
        System.out.println("7am -3pm");
    }
    
    @Override
    public String toString() {
        return "Teacher [name =" + getName() + ", id =" + getId() + ", address =" + getAddress() + ", gender =" + getGender() + ", age =" + getAge()+", Graduation =" +graduation  + "]";
    }
    public void getDetail() {
        System.out.println("name =" + getName() + ", id =" + getId() + ", address =" + getAddress() + ", gender =" + getGender() + ", age =" + getAge()+", Graduation =" +graduation );
    }
    
}
