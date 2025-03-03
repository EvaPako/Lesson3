package org.example;

public class Circle implements SquareAndPerimeter {
   private double radius;
   public String fill_color;
   public String fill_border_color;

   public Circle (double radius) {
       this.radius = radius;
   }
   @Override
    public double square () {
       return Math.PI * Math.pow(radius, 2);
   }
    @Override
    public double perimeter () {
       return 2*Math.PI*radius;
   }

    @Override
    public void setColors(String fill_color, String fill_border_color) {
        this.fill_color = fill_color;
        this.fill_border_color = fill_border_color;
    }

}
