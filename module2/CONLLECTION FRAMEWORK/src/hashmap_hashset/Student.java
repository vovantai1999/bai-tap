package hashmap_hashset;

public class Student {
    public String name;
    public int age;
    public String addres;

    public Student() {
    }

    public Student(String name, int age, String addres) {
        this.name = name;
        this.age = age;
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddres() {
        return addres;
    }


    public void setAddres(String addres) {
        this.addres = addres;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addres='" + addres + '\'' +
                '}';
    }
}