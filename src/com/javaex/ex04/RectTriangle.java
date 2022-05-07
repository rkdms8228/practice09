package com.javaex.ex04;

public class RectTriangle extends Shape {
	
	//필드
    private double width;
    private double height;

    //생성자
    public RectTriangle() {
    }
    
    public RectTriangle( double width, double height ) {
        this.width = width;
        this.height = height;
    }
    
    //메소드-일반
    public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
    
    //메소드-일반
    public double getArea() {
        return width*height*0.5;
    }

	public double getPerimeter() {
        double result = width + height + Math.sqrt( width*width + height*height );
        return result;
            
    }

}