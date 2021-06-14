/**
 * @author Leona Rose (1972034)
 */

 public class Circle extends Shape{
    private double radius;

    public Circle(){
    }

    public Circle(double radius){
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    // get area
    @Override
    public double getArea(){
            double area = Math.PI*getRadius()*getRadius();
        return area;
    }
}