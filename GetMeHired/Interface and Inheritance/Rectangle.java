package GetMeHired.Assignment3;

public class Rectangle extends Shape implements Resizable{

    int width;
    int height;
    
    public Rectangle(int width, int height) {
        super(4);
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
    public void resize(double x) {
       setHeight(height-(int)x);
       
        
    }
    @Override
    public double getArea() {

        return (height*width);
    }
    @Override
    public double perimeter() {
       
        return 2*(height+width);
    }
    

    
    
}
