public class HackRankRotation {

    public static void main(String[] args) {
        int[] n= {1,2,3,4};
        int rotation = 2;
        String s = "";
        int[] x = new int[n.length];


        if(rotation>(n.length-1)){
            rotation = rotation%n.length;

        }
        System.out.println(rotation);

       


        for (int i = rotation; i < n.length; i++) {
           
           s=s+n[i]+" ";
        }
        for (int i = 0; i < rotation; i++) {
            
            s=s+n[i]+" ";
        }


        String [] parts = s.split(" ");

        for (int i = 0; i < n.length; i++) {
            System.out.print(parts[i]);
        }
        
        
    

       
       
    }
    
}
