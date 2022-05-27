import java.util.Scanner;

public class Marksheet {
  
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        System.out.println("************  MARKSHEET ************");
        System.out.print("enter sub1 marks: ");
        float m1 = sc.nextFloat();

        System.out.print("enter sub2 marks: ");
        float m2 = sc.nextFloat();

        System.out.print("enter sub3 marks: ");
        float m3 = sc.nextFloat();

        System.out.print("enter sub4 marks: ");
        float m4 = sc.nextFloat();

        System.out.print("enter sub5 marks: ");
        float m5 = sc.nextFloat();

          float total =   m1 + m2 + m3 + m4 + m5 ;
           
           float  per = (total / 500) * 100;

        System.out.println ("Total: " + total);
     
        System.out.println ("Percentage" + per);


        
    }
}
