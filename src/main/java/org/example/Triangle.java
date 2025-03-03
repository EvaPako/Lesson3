package org.example;

public class Triangle implements SquareAndPerimeter {
    private final double a;
    private final double b;
    private final double c;
    String fill_color;
    String fill_border_color;

    public Triangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double square () {
        double s = perimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    @Override
    public double perimeter (){
        return a+b+c;
    }

    @Override
    public void setColors(String fill_color, String fill_border_color) {
        this.fill_color = fill_color;
        this.fill_border_color = fill_border_color;
    }
}
