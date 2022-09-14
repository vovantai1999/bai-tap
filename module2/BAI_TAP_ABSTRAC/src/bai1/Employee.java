package bai1;

import java.util.List;

public abstract class Employee {
    private static int id;
    private String fullName;
    private String birthDay;
    private String phone;
    private String email;
    private int employeeType;
    private List<Certificated> certificateds;
    private static int employeeCount;

    public Employee(String fullName, String birthDay, String phone, String email, int employeeType, List<Certificated> certificateds) {
        id++;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
        this.certificateds = certificateds;
        employeeCount++;
    }

    public static int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public List<Certificated> getCertificateds() {
        return certificateds;
    }

    public void setCertificateds(List<Certificated> certificateds) {
        this.certificateds = certificateds;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public String showInfo() {
        return  "id='" + id + '\'' +
                "fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employeeType='" + employeeType + '\'';
    }
    public abstract void showMe();
}