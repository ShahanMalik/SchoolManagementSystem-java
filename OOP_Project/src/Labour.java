
public class Labour  extends Abstract{
    private boolean isMatricPass;

    public Labour(String name, String id, String address, String gender, int age, boolean isMatricPass) {
        super(name, id, address, gender, age);
        this.isMatricPass = isMatricPass;
    }

    @Override
    public String toString() {
        return "Labour [name =" + getName() + ", id =" + getId() + ", address =" + getAddress() + ", gender =" + getGender() + ", age =" + getAge()+"isMatricPass =" +isMatricPass+ "]";
    }
    @Override
    public void CalculateEarning(){
        System.out.println("5,000 RS");
    }
    @Override
    public void OfficeHours(){
        System.out.println("Office hours : 7am - 2pm");
    }

    public boolean isMatricPass() {
        return isMatricPass;
    }
    public void setMatricPass(boolean isMatricPass) {
        this.isMatricPass = isMatricPass;
    }

    public void getDetail() {
        System.out.println("name =" + getName() + ", id =" + getId() + ", address =" + getAddress() + ", gender =" + getGender() + ", age =" + getAge()+"isMatricPass =" +isMatricPass );
    }


}