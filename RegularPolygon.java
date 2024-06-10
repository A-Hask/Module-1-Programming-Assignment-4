public class RegularPolygon {

    //dimensions of the polygon
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
  
    //construct a default polygon object
    RegularPolygon () {
    }
  
    RegularPolygon(int newN, double newSide) {
      n = newN;
      side = newSide;
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
    
      public static void main(String[] args){
        RegularPolygon polygon1 = new RegularPolygon();
        polygon1.getArea();
        polygon1.getPerimeter();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        polygon2.getArea();
        polygon2.getPerimeter();
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        polygon3.getArea();
        polygon3.getPerimeter();
    }
  }
  