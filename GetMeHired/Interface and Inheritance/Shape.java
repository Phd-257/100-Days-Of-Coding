package GetMeHired.Assignment3;

public abstract class Shape {

    int numSide;
    public int getNumSide() {
        return numSide;
    }
    
    Shape(int numSide){

        this.numSide = numSide;

    }

    public abstract double getArea();
    public abstract double perimeter();


    

    
}
