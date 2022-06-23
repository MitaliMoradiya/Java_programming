public class Vararguments{


   /*  staic int sum(int a, int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
{
    System.out.println("welcomw to the  tutorial ");
    System.out.println("the sum of  4 and 5 is: " + sum(a:4, b:5));
    System.out.println("the sum of 4,3 and 5 is:" + sum(a:4, b:3, c:5));*/

    static int add(int ...arr){
        int result = 0;
        for (int a:arr)
        {
            result = result + a;

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6));
        
    }

}
