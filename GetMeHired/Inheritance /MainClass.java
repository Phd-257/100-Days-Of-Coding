package GetMeHired.Assignment4;

public class MainClass {
    
    public static void main(String[] args) {
        
        Car c= new Car("Okay", 4, 1200);
        Bmw bmw = new Bmw("x5", 4 , 1300 , "Blue", true);


        System.out.println(c.wheels);
        c.brake();
        bmw.brake();
        c.accelerate();
        
    
        
    }
}

//ans of second question is ......."GFG"
