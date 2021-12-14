package GetMeHired.Assignment4;

public class Audi extends Car {

    String color;
    boolean hasSunroof;


    Audi(String name, int doors, int engineSize,String color,boolean hasSunroof) {
       
        
        super(name, doors, engineSize);
        this.color=color;
        this.hasSunroof=hasSunroof;
        

       
    }

    
    public void startEngine(){
        
        System.out.println("Audi Engine Started..");
        
    }
   
    public void brake(){
        
        System.out.println("Audi is Braking...");
        
    }
    public void running(){
        System.out.println("Audi is running");
    }

    
}
