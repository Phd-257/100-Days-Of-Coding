package Hundred_Days_Of_Code;

import java.util.Scanner;

public class MainArray {
   
    public static void main(String[] args) {
        int avg=0;
        System.out.println("How many Students");
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());

        int[] marks = new int[n];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("enter marks of "+(i+1)+" student");
            marks[i]=Integer.parseInt(sc.nextLine());


        }


        //System.out.println("Half part is competed");

        for (int i : marks) {
            avg=avg+i;
        }

        Double avMarks= ((double)avg / (double)n);
        System.out.println("Average Marks is "+ avMarks); 
        

    }
}
