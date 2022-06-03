import java.util.Scanner;


public class Practise4 {
    public static void main(String[] args) {
        
   /*     //QUE1: what will be the output of this program 
    int a = 10;
    //if (a = 11) = operator not allowed here == is used for compare
    if (a == 11)
    {
        System.out.println("i am 11");
    }
    else{
        System.out.println("i am not 11");*/


        /*QUE 2:Write a Program to find out whether a student is pass or fail:
                if it requires total 40% and at least 33% in each subject to Pass
                assume 3 subject and take marks as an input from the user

                
            Scanner sc = new Scanner(System.in);

            System.out.println("enter subject1 marks");
            float s1 = sc.nextFloat();

            System.out.println("enter subject1 marks");
            float s2 = sc.nextFloat();
            
            System.out.println("enter subject1 marks");
            float s3 = sc.nextFloat();

            float sum = s1 + s2 + s3;
            float avg = sum/3;
            float per = (sum/300)*100;

            System.out.println(sum);
            System.out.println(avg);
            System.out.println(per);
         
            if (avg >= 40 && s1>=33 && s2>=33 && s3>=33)
            {
            System.out.println("You are Pass");
            }
            else
            {
                System.out.println("Better performance next time");
            }     */       
                

    /* QUE3:calculate income tax paid by an employee to the government as per the slabs mentioned below
                            INCOme slabs     TaX
                            2.5lac - 5.0lac       5%
                            5.0lac - 10.0lac      20%
                            above 10.0l       30%

         Scanner sc = new Scanner(System.in);
         System.out.println("enter your income");
        float tax = 0;
         float income = sc.nextFloat();

            if (tax <2.5f)
            {
             tax = tax + 0;
            }
        else if(tax>2.5f && tax < 5f)
        {
        tax = tax + 0.05f + (income - 2.5f);
        }
        else if(tax>5f && tax<10.0f)
        {
        tax = tax + 0.05f + (5.0f - 2.5f);
        tax = tax + 0.2f + (income - 5f); 
        }
        else if(tax>10.0f)
        {
            tax = tax + 0.05f + (5.0f - 2.5f);
            tax = tax + 0.2f + (10.0f - 5f);
            tax = tax + 0.3f + (income - 10.0f);
        }
        System.out.println("total tax paid by employee: " + tax);
    }
}*/


/* QUE4:  write a java program to find out the day of the week given the number 
           [1 for monday, 2 for tuesday .. and so on!]

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number");
          int days;
          days = sc.nextInt();
          

          switch(days){
              case 1:
              System.out.println("Monday");
              break;

              case 2:
              System.out.println("Tuesday");
              break;

              case 3:
              System.out.println("Wednesday");
              break;

              case 4:
              System.out.println("Thursday");
              break;

              case 5:
              System.out.println("Friday");
              break;

              case 6:
              System.out.println("saturday");
              break;

              case 7:
              System.out.println("Sunday");
              break;

          }*/

          //QUE5: year is leap year or not

          /*Scanner sc = new Scanner(System.in);
          System.out.println("enter Year");
          int year;
          year = sc.nextInt();

          if(year % 400 == 0)
          {
              System.out.println(year + "is a leap year");
          }
          else if
          (year % 100 == 0 )
          {
              System.out.println(year + "is not a leap year");
          }
          else if
          (year % 4 == 0)
          {
              System.out.println(year + "is a leap year");
          }
          else{
              System.out.println(year + "is not a leap year");
          }*/

          /*QUE^: write a progra to find out the type of website fro the url
                        .com = commercial website
                        .org = organisation website
                        .in = indian website*/

            Scanner sc = new Scanner(System.in);
            System.out.println("enter website");
            String website = sc.next();

            if (website.endsWith(".org"))
            {
            System.out.println("organisational website");
            }

            else if (website.endsWith(".com"))
            {
            System.out.println("commercial website");
            }

            else if (website.endsWith(".in"))
            {
            System.out.println("indian website");
            }
        }
    }

          
