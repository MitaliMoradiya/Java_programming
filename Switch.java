import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {

        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age){
            case 18:
            System.out.println("you are adult");
            break;

            case 23:
            System.out.println("become an join a job");
            break;

            case 60:
            System.out.println("get retired");
            break;

            default:
            System.out.println("enjoy your life");
        }

        System.out.println("Always be happy"); //print this after all output
        /*if (age > 56)
        {
        System.out.println("you are experienced");

    }
    
    else if (age > 46)
    {
        System.out.println("semi experinced");

    }

    else if (age > 36)
    {
        System.out.println("semi seemi experienced");
    }
    else {
        System.out.println("not experinced");
    }*/



}
}