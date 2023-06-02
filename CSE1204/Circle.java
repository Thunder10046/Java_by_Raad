package CSE1204;

import java.awt.Point;

public class Circle {
    Point c; 
    double r;

    public 
    Circle(Point c, double r)
    {
        this.c = c; 
        this.r = r;
    }

    double area()
    {
        return 2.314*r*r;
    }

    Point getcenter()
    {
        return c;
    }


}
