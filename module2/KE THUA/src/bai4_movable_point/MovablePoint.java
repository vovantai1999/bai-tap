package bai4_movable_point;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
    }

    public MovablePoint(float xSpeed, float ySpeed) {

    }

    public MovablePoint() {
    }
    public float getxSpeed(){
        return xSpeed;
    }
    public void setxSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getySpeed(){
        return  ySpeed;

    }
    public void setySpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float y){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return (" xSpeed = " + xSpeed + " ySpeed = " + ySpeed + super.toString());
    }
}
