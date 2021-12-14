package GetMeHired.Assignment4;

public class Bmw extends Car{

    
    String color;
    boolean hasSunroof;


    Bmw(String name, int doors, int engineSize,String color,boolean hasSunroof) {
       
        
        super(name, doors, engineSize);
        this.color=color;
        this.hasSunroof=hasSunroof;
        

       
    }

    
    public void startEngine(){
        
        System.out.println("Bmw Engine Started..");
        
    }
   
    public void brake(){
        
        
        System.out.println("Bmw is Braking...");
        
    }
    public void running(){
        System.out.println("bmw is running");
    }

}
