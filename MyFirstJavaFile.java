import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        System.out.println("The area will be displayed here");
        System.out.println("Enter the length of the rectangle");
        double length=input.nextDouble();
        System.out.println("Enter the length of the breadth");
        double breadth=input.nextDouble();
        System.out.println("The area is "+ReturnArea(length,breadth));
       
    }
    public static double ReturnArea(double l,double b){
        double area=l*b;
        return area; 
     }
}