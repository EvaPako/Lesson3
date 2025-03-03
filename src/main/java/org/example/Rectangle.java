package org.example;

class Rectangle implements SquareAndPerimeter {
    private double width;
    private double height;
    String fill_color;
    String fill_border_color;

    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double square () {
        return width*height;
    }
    @Override
    public double perimeter () {
        return 2*(width*height);
    }

    @Override
    public void setColors(String fill_color, String fill_border_color) {
        this.fill_color = fill_color;
        this.fill_border_color = fill_border_color;
    }
}
