
public class SecurityGuard  extends Abstract{
    boolean isMatricPass;

    public SecurityGuard(String name, String id, String address, String gender, int age, boolean isMatricPass) {
        super(name, id, address, gender, age);
        this.isMatricPass = isMatricPass;
    }

    public boolean isMatricPass() {
        return isMatricPass;
    }

    public void setMatricPass(boolean isMatricPass) {
        this.isMatricPass = isMatricPass;
    }

    @Override
    public String toString() {
        return "SecurityGuard [name =" + getName() + ", id =" + getId() + ", address =" + getAddress() + ", gender =" + getGender() + ", age =" + getAge()+"isMatricPass =" +isMatricPass+ "]";
    }
    @Override
    public void CalculateEarning(){
        System.out.println("9,000 RS");
    }
    @Override
    public void OfficeHours(){
        System.out.println("Office hours : 7am-6pm");
    }

    public void getDetail() {
        System.out.println("name =" + getName() + ", id =" + getId() + ", address =" + getAddress() + ", gender =" + getGender() + ", age =" + getAge()+"isMatricPass =" +isMatricPass );
    }
    
}
