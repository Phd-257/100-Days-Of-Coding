package Hundred_Days_Of_Code;

public class LeetTwoSum {
    
    public static void main(String[] args) {
        int[] arr={7,2,11,15};
        int target = 9;
        int[] ans  = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    ans[0]= i;
                    ans[1] =j;
                    break;
                    
                }
            }
            
        }
        for (int i : ans) {
            System.out.print(i+" ");
        }

    }
}
