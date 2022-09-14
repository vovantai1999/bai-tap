package bai1;

import javax.security.cert.Certificate;
import java.util.List;

public class Intern extends Employee {
    private String majors;
    private String semester;
    private String universityName;
    private static final int TYPE_INTERN = 2;

    public Intern(String fullName, String birthDay, String phone,
                  String email, String majors, String semester,
                  String universityName, List<Certificated> certificateds) {
        super(fullName, birthDay, phone, email, TYPE_INTERN, certificateds);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void showMe() {
        System.out.println("Intern " + super.showInfo() +
                "majors='" + majors + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'');
    }
}
