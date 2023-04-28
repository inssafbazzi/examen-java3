import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {


    private String Fullname;
    private int age;
    private boolean isMale;
    private String adressMail;


    public Person(String Fullname, int age, boolean isMale, String adressMail) {
        this.Fullname = Fullname;
        this.age = age;
        this.isMale = isMale;
        this.adressMail = adressMail;
    }

    public Person(String Fullname, int age, boolean isMale) {
        this.Fullname = Fullname;
        this.age = age;
        this.isMale = isMale;
        this.adressMail = adressMail;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getadressMail() {
        return adressMail;
    }


    public void setadressMail(String adressMail) {
        this.adressMail = adressMail;
    }


}
