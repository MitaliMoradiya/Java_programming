//used to take input from user
//import scanner class 
import java.util.Scanner;

class Takeinput {

    public static void main(String[] args)
     {
         //take input from user
         //create an object sc of scanner class 
         Scanner sc = new Scanner(System.in);
         System.out.println("enter no2");
         int a = sc.nextInt();

         System.out.println("enter no3");
         int b = sc.nextInt();

         int sum = a + b;
         System.out.println(sum);

         boolean b1 = sc.hasNextInt();
         System.out.println(b1);
        
    }
}




























