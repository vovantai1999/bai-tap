package bai1;

import java.util.List;

public class Fresher extends Employee {
    private String graduationDate;
    private String graduationRank;
    private String education;
    private static final int TYPE_FRESHER = 1;

    public Fresher(String fullName, String birthDay, String phone,
                   String email, String graduationDate,
                   String graduationRank, String education, List<Certificated> certificateds) {
        super(fullName, birthDay, phone, email, TYPE_FRESHER,certificateds);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public void showMe() {
        System.out.println("Fresher " + super.showInfo() +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'');
    }
}
