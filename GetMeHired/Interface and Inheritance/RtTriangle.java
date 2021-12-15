package GetMeHired.Assignment3;

public class RtTriangle extends Shape{
    int width;
    int height;

    public RtTriangle(int width, int height) {
        super(3);
        this.width = width;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        
        return 0.5*(height*width);
    }
    @Override
    public double perimeter() {
        
        return (height+width);
    }



    
    
}
