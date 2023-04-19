public class Student extends Person{
    private String schoolTime;
    private int marks;
    private int attendance;
    
    public Student(String name, String id, String address, String gender, int age, String schoolTime, int marks,
            int attendance) {
        super(name, id, address, gender, age);
        this.schoolTime = schoolTime;
        this.marks = marks;
        this.attendance = attendance;
    }

    public String getSchoolTime() {
        return schoolTime;
    }

    public void setSchoolTime(String schoolTime) {
        this.schoolTime = schoolTime;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student [name = " + getName() + ", id = " + getId() + ", address = " + getAddress() + ", gender = " + getGender() + ", age = " + getAge()+", School time = " + schoolTime+ ", marks = " + marks + ", attendance = " + attendance + "]";
    }
    public void getDetail() {
        System.out.println("name = " + getName() + ", id = " + getId() + ", address = " + getAddress() + ", gender = " + getGender() + ", age = " + getAge()+", School time = " + schoolTime + ", marks = " + marks + ", attendance = " + attendance );
    }

    
}
