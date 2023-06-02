package CSE1204;

import java.awt.Point;

public class third {

    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(4, 2), 5);
        System.out.println("Center=" + c1.getcenter());
        System.out.println("Area=" + c1.area());

    }

}
