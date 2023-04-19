public abstract class Abstract {
    private String name;
    private String id;
    private String address;
    private String gender;
    private int age;
    public Abstract(String name, String id, String address, String gender, int age) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }
    
    public String getName() {
        return name; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Abstract [name=" + name + ", id=" + id + ", address=" + address + ", gender=" + gender + ", age=" + age
                + "]";
    }
     public abstract void CalculateEarning();
     public abstract void OfficeHours();
    
}
