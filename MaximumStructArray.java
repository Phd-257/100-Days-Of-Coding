package Arrays;

public class MaximumStructArray {
    
    public static void main(String[] args) {
        Height h = new Height(2, 3);
        Height h1 = new Height(2, 3);
        Height h2 = new Height(2, 3);

        Height[] arr = {h,h1,h2};

        System.out.println(findMax(arr));
        
    }
    public static int findMax(Height arr[])
    {
        int height=0;
        int max = 0;
       
       for(int i=0;i<arr.length;i++){
           
           height = height+(arr[i].feet*12+arr[i].inches);
           if(height>max){
               max= height;
           }
           
       }
    return max;
       
       
    }

    
}
class Height {
	int feet;
	int inches;
	public Height(int ft, int inc)
	{
	    feet = ft;
	    inches = inc;
	}
}
