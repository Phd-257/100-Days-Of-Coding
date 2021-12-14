package GetMeHired.Assignment4;


 public class Car {

    int engineSize;
    int miPerLi;
    String type;
    int doors;
    static int wheels;
    String name;
   

    Car(String name, int doors,int engineSize){
        this.name = name;
        this.doors=doors;
        this.engineSize=engineSize;
        wheels=4;
    }
    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getMiPerLi() {
        return miPerLi;
    }

    public void setMiPerLi(int miPerLi) {
        this.miPerLi = miPerLi;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void startEngine(){
        System.out.println("Engine Started..");
    }
    public void accelerate(){
        System.out.println("car is Accerating..");
    }
    public void brake(){
        System.out.println("Car is Braking...");
    }





    
}
