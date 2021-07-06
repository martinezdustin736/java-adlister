import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private long empNo;
    private String first_Name;
    private String last_Name;
    private char gender;
    private Date birthDate;
    private Date hireDate;



    public Employee(){

    }


    public Employee(long empNo, String first_Name, String last_Name, char gender, Date birthDate, Date hireDate) {
        this.empNo = empNo;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public Employee(String first_Name, String last_Name, char gender, Date birthDate, Date hireDate) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(long empNo) {
        this.empNo = empNo;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}


