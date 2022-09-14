package bai1;

import java.util.List;

public class Experience extends Employee {
    private int ExpInYear; // Số năm kinh nghiệm
    private String proSkill; //Kỹ năng chuyên môn
    private static final int TYPE_EXPERIENCE = 0;

    public Experience(String fullName, String birthDay, String phone,
                      String email, int expInYear, String proSkill, List< Certificated> certificateds) {
        super(fullName, birthDay, phone, email, TYPE_EXPERIENCE,certificateds );
        ExpInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void showMe() {
        System.out.println("Experience " + super.showInfo() +
                ", ExpInYear='" + ExpInYear + '\'' +
                ", proSkill='" + proSkill + '\'');

    }
}