package so_sanh_hinh_hoc;

import interface_comparable.Circle;
import java.util.Arrays;
import interface_comparable.ComparableCircle;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }

    private static class CircleComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }

        @Override
        public Comparator reversed() {
            return Comparator.super.reversed();
        }

        @Override
        public Comparator thenComparing(Comparator other) {
            return Comparator.super.thenComparing(other);
        }

        @Override
        public Comparator thenComparingInt(ToIntFunction keyExtractor) {
            return Comparator.super.thenComparingInt(keyExtractor);
        }

        @Override
        public Comparator thenComparingLong(ToLongFunction keyExtractor) {
            return Comparator.super.thenComparingLong(keyExtractor);
        }

        @Override
        public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
            return Comparator.super.thenComparingDouble(keyExtractor);
        }

        @Override
        public Comparator thenComparing(Function keyExtractor) {
            return Comparator.super.thenComparing(keyExtractor);
        }

        @Override
        public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
            return Comparator.super.thenComparing(keyExtractor, keyComparator);
        }
    }
}
