package so_sanh_hinh_hoc;

import interface_comparable.Circle;

import java.util.Comparator;


public class CicleComparator implements Comparator <Circle> {

    public CicleComparator(){}
    @Override
    public int compare(Circle o1, Circle o2) {
        if(o1.getRadius() > o2.getRadius()) return 1;
        else if(o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }
}
