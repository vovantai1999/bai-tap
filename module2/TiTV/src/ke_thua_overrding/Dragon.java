package ke_thua_overrding;

public class Dragon extends Animal{
    public Dragon() {
        super("Dragon");
    }
    public void eat(){
        System.out.println("tôi đang ăn cá");
    }
    public void makeSound(){
        System.out.println("alo alo");
    }
    public  void sleep(){
        System.out.println("haha");
    }
}
