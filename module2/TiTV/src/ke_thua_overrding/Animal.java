package ke_thua_overrding;

public class Animal {
     protected String name;

     public Animal(String name){
          this.name = name;

     }
     public String getName(){
          return name;
     }
     public void setName(String name){
          this.name = name;
     }
     public void eat(){
          System.out.println("tôi đang ăn");
     }
     public void sleep(){
          System.out.println("zzzz");
     }
     public void makeSound(){
          System.out.println("...........");
     }



}
