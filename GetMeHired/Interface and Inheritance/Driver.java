package GetMeHired.Assignment3;

public class Driver {

        public static void main(String[] args) {
            Rectangle rc1 = new Rectangle(10, 8);
            System.out.println("Area "+rc1.getArea()+" Perimeter"+rc1.perimeter());
            rc1.resize(4);
            System.out.println("Area "+rc1.getArea()+" Perimeter"+rc1.perimeter());

        }
    
}
