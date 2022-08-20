package bai4_movable_point;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(23);
        point.setY(13);
        System.out.println(point);
        System.out.println("---------------------------------------------");

        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setxSpeed(44);
        movablePoint.setySpeed(55);
        System.out.println(movablePoint);
    }
}
