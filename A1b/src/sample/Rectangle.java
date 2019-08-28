package sample;

public class Rectangle{
    Rectangle(double a, double b){
        this.sideA = a;
        this.sideB = b;
        this.calculateArea();
    }
    private double sideA = 0;
    private double sideB = 0;
    private double area = 0;

    void calculateArea() {
        this.area = this.sideA * this.sideB;
    }

    public double getArea(){
        return area;
    }

    public static double rectangleStatic(double a, double b){
        return a*b;
    }

}
