package GetMeHired.Assignment4;

public class Honda extends Car{


    String color;
    boolean hasSunroof;


    Honda(String name, int doors, int engineSize,String color,boolean hasSunroof) {
       
        
        super(name, doors, engineSize);
        this.color=color;
        this.hasSunroof=hasSunroof;
        

       
    }

    
    public void startEngine(){
        
        System.out.println("Honda Engine Started..");
        
    }
   
    public void brake(){
        
        System.out.println("Honda is Braking...");
        
    }
    public void running(){
        System.out.println("Honda is running");
    }

    
}
