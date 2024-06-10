/*
 * 9.9 (GEOMETRY: N-SIDED REGULAR POLYGON) In an 𝑛-sided regular polygon, all sides have the same length 
 * and all angles have the same degree (i.e., the polygon is both equilateral and equiangular). 
 * Design a class named RegularPolygon that contains:
 * A private int data field named n that defines the number of sides in the polygon with default value 3.
 * A private double data field named side that stores the length of the side with default value 1.
 * A private double data field named x that defines the 𝑥-coordinate of the polygon’s center with default 
 * value 0.
 * A private double data field named y that defines the 𝑦-coordinate of the polygon’s center with default 
 * value 0.
 * A no-arg constructor that creates a regular polygon with default values.
 * A constructor that creates a regular polygon with the specified number of sides and length of side, 
 * centered at (0, 0).
 * A constructor that creates a regular polygon with the specified number of sides, length of side, 
 * and 𝑥- and 𝑦-coordinates.
 * The accessor and mutator methods for all data fields.
 * The method getPerimeter() that returns the perimeter of the polygon.
 * The method getArea() that returns the area of the polygon. The formula for computing the area of a 
 * regular polygon is
 * Area = (𝑛 × 𝑠^2)/() 4 × tan ( 𝜋/𝑛 )).
 * Draw the UML diagram for the class then implement the class. Write a test program that creates three 
 * RegularPolygon objects, created using the no-arg constructor, using RegularPolygon(6, 4), and using 
 * RegularPolygon(10, 4, 5.6, 7.8). For each object, display its perimeter and area.
 */


class Circle {
    //radius of the circle
    double radius = 1;

    //construct a circle object
    Circle () {
    }

    //construct a circle object
    Circle (double newRadius) {
        radius = newRadius;
    }

    //return the area
    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    //set a new radius
    void setRadius (double newRadius){
        radius = newRadius;
    }
}


public class RegularPolygon {

    //dimensions of the polygon
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    //construct a default polygon object
    RegularPolygon(){

    }

    RegularPolygon(int newN, double newSide, double newX, double newY) {
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    //set a new n
    void setN (int newN){
        n = newN;
    }

    //set a new side
    void setSide (double newSide){
        side = newSide;
    }

    //set a new x
    void setX (double newX){
        x = newX;
    }

    //set a new y
    void setY (double newY){
        y = newY;
    }

    //calculate and display the perimeter
    double getPerimeter () {
        double perimeter = n * side;
        System.out.println("The perimeter is " + perimeter + "!");
        return perimeter;
    }

    //calculate and display the area
    double getArea () {
        double pi = Math.PI;
        double tan = Math.tan(pi/n);
        double area = (n * (side * side))/4 * tan;
        System.out.println("The area is " + area + "!");
        return area;
    }

    RegularPolygon(6, 4) {
        getArea();
        getPerimeter();
    }
    
    RegularPolygon(10, 4, 5.6, 7.8){
        getArea();
        getPerimeter();
    }
}