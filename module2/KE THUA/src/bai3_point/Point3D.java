package bai3_point;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        x = x;
        y = y;
        this.z = z;
    }
    public String toString(){
        return ("Point3D = " + z + super.toString() );
    }
}
