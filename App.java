package com.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("enter the student list:");
        int n=ob.nextInt();
        int[] marks=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the student marks:"+(i+1));
            marks[i]=ob.nextInt();
        System.out.println(" the student marks:"+marks[i]);
            if(marks[i]>=80){
              System.out.println("A");
            }
           else if(marks[i]>=60){
                System.out.println("B");
              }
             else if(marks[i]>=40){
                System.out.println("C");
              }
            else  if(marks[i]>=20){
                System.out.println("D");
              }
              else{
                System.out.println("Fail");
              }
    }
}
}
