import java.util.Scanner;;
public class Practise5 {

    public static void main(String[] args) {
    // QUE1 : print pattern

   /* int n = 6;
    for(int i=n; i>0; i--)
    {
        for(int j=0; j<i; j++)
      
        {
            System.out.print("*");
        }
        System.out.println("\n");
    }*/

    //QUE2: Write program to sum first n even numbers using while loop
   /* int sum = 0;
    int n = 3;
    for(int i=0; i<n; i++)
    {
        sum = sum + (2*i);
    }
    System.out.print("sum of even num:");
    System.out.println(sum);
        }
     }*/

     //QUE3: write program to print multiplication table of given number n
    /* int n = 5;
     
     for(int i=1; i<=10; i++){
         System.out.printf("%d  X %d = %d\n",n,i,n*i );
     }*/

     //QUE4: write a program to print multiplication table of 10 in reverse order
    /* int n = 10;
     for(int i=10; i>=1; i--){
         System.out.printf("%d X %d = %d\n",n,i,n*i );
     }*/

     //QUE5: write a program to find factorial of a given number using for loop
            /* int n =5;
             int factorial = 1;

             for(int i=1; i<=n; i++)
             {
                    factorial *=i;
                    System.out.println(factorial);
             }   
            }
        }*/

     //QuE6; Repeat 5 using while loop
     /*int n = 5;
        int i =1;//factorial : n = n* n-1 8 n-2.....1
                                //5!(5 factorial) = 5*4*3*2*1
         int factorial = 1;
            while(i<=n){
                factorial *= i;
                i++;


    }
    System.out.println(factorial);
    }
}*/



//QUE7: what can be done using one type of loop can be done using the other two types of loops. True or false
        //ans: True

//QUe8: write a program to calculate the sum of the numbers occuring in the multiplication table of 8

/*int n = 8;
int sum = 0;
for(int i=1; i<=10; i++){
    sum += n*i;
}
System.out.println(sum);
    }
}*/

//QUE 9: A do while loop is executed:
       /* 1.at least once
        2.at least twice
        3.at least three*/

        //ANS : at least once

   

//QUE10: write a program which print the even numbers between 1 to 100 in an increasing order.
/*int n=100;
for(int i=0; i<=100; i++)

{
    System.out.println(2*i);

}*/

//QUE11: write a program reads a sequence of integers from the user and stops by diplaying
//"done" when the sum of these values exceeds 100

Scanner sc = new Scanner(System.in);

int sum =0;
while(true){
    System.out.print("eneter a number:");
    sum += sc.nextInt();

    if(sum > 100)
    break;
}

System.out.println("done: " +sum);





 }
}