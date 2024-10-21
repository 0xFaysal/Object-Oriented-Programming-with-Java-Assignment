import java.util.ArrayList;
import java.util.Collections;

public class Q7 {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(3, 4));
        points.add(new Point(1, 2));
        points.add(new Point(9, 10));
        points.add(new Point(13, 14));
        points.add(new Point(5, 6));
        points.add(new Point(7, 8));
        points.add(new Point(11, 12));

        Collections.sort(points);
        System.out.println(points);
    }
}


class Point implements Comparable<Point> {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point p) {
        return (p.x+p.y) - (this.x+this.y);
    }

    public String toString() {
        return x + " " + y;
    }

}