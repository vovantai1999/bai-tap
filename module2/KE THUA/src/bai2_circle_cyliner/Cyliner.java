package bai2_circle_cyliner;

public class Cyliner extends Circle {
    private double hight;

    public Cyliner() {

    }
    public Cyliner(double hight){
        this.hight = hight;
    }
    public double getHight(){
        return hight;
    }
    public void setHight(double hight) {
        this.hight = hight;
    }
    public double getV(){
        return Math.pow(getRadius(),2) * hight * Math.PI;
    }
    public String toString(){
        return ("Hight = " + hight   + super.toString());
    }
}
