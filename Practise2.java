import java.util.Scanner;
public class Practise2
 {
     public static void main(String[] args)
      {
          //******** Que1: output of : float a = 7/4*9/2

          //float a = 7/4 * 9/2;
          float a = 7/4.0f * 9/2.0f;
          System.out.println(a);


          //********** Que2: inc-dec the grade
          char grade = 'a';
          grade = (char)(grade + 8); //(a + 8)= i
          System.out.println(grade);

          grade = (char)(grade - 8); //(a - 8)= a
          System.out.println(grade);

        //**********Que3: find userdefined num is bigger or not
        /* Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(m > 8);*/

        //******QUe4: write following expression 
        float v=10.0f;
        float u = 20.0f;
        float a1 = 6.0f;
        float s = 3.0f;

            float i = (v*v)-(u*u)/(2*a1*s);
        System.out.println(i);


        //*********QUE5: find the value 

        int x = 7;
        int a2 = 7*49/7+35/7;
        System.out.println(a2);
     }

    
}
