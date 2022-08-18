package bai_tap_ve_nha;

public class Person_Demo {
    private String name;
    private String mail;
    private int age;
    private double weight;

    public Person_Demo() {
    }

    public Person_Demo(String name, String mail, int age, double weight) {
        this.name = name;
        this.mail = mail;
        this.setAge(age);
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("tuổi ko hợp lệ");
        } else {
            this.age = age;}
        }

        public double getWeight () {
            return weight;
        }

        public void setWeight ( double weight){
            this.weight = weight;
        }


    @Override
    public String toString() {
        return "Person_Demo{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
