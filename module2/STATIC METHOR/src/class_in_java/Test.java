package class_in_java;

public class Test {
    private String name = "john";
    private String classe = "CO2";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Test() {
        this.classe = classe;
        this.name = name;

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.getClasse();
        test.getName() ;
        System.out.println(test.getClasse());
        System.out.println(test.getName());

    }
}
