public class Secretary extends Person {

    private String department;

    public Secretary(String Fullname, int age, boolean isMale, String adressMail, String department) {
        super(Fullname, age, isMale, adressMail);
        this.department = department;
    }

    public Secretary(String Fullname, int age, boolean isMale, String department) {
        super(Fullname, age, isMale);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
