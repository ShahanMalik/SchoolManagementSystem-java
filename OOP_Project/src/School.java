public class School {
    private _Class _class;
    private Teacher teacher;
    private Student student;
    private OfficeStaff staff;
    private Labour labour;
    private SecurityGuard security;
    private _Bus bus;
    private Principal principal;
   
    public School(_Class _class, Teacher teacher, Student student, OfficeStaff staff, Labour labour,
            SecurityGuard security, _Bus bus, Principal principal) {
        this._class = _class;
        this.teacher = teacher;
        this.student = student;
        this.staff = staff;
        this.labour = labour;
        this.security = security;
        this.bus = bus;
        this.principal = principal;
    }

    public _Class get_class() {
        return _class;
    }

    public void set_class(_Class _class) {
        this._class = _class;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public OfficeStaff getStaff() {
        return staff;
    }

    public void setStaff(OfficeStaff staff) {
        this.staff = staff;
    }

    public Labour getLabour() {
        return labour;
    }

    public void setLabour(Labour labour) {
        this.labour = labour;
    }

    public SecurityGuard getSecurity() {
        return security;
    }

    public void setSecurity(SecurityGuard security) {
        this.security = security;
    }

    public _Bus getBus() {
        return bus;
    }

    public void setBus(_Bus bus) {
        this.bus = bus;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void getDetail() {
        System.out.println("School [_class=" + _class + ", teacher=" + teacher + ", student=" + student + ", staff=" + staff
        + ", labour=" + labour + ", security=" + security + ", bus=" + bus + ", principal=" + principal);
    }

    @Override
    public String toString() {
        return "School [_class=" + _class + ", teacher=" + teacher + ", student=" + student + ", staff=" + staff
                + ", labour=" + labour + ", security=" + security + ", bus=" + bus + ", principal=" + principal + "]";
    }

    
    
}
