public class Methodoverloading
{
    static void change(int a) 
    { 
     a = 98; //it try to chng a
    }
    static void change2(int [] arr)
    {
        arr[0] = 98;
    }
        static void telljoke()  //it return nthng so that use void
    {
        System.out.println("here the funny jokes");

    }

    public static void main(String[] args)
    {
        //telljoke();
       // int[] marks = {90,70,80,79,89};  //create array

        //case1: changing the ineteger
       // int x = 45;
         //change(x);
         //System.out.println("the value of a after running change is  " + x);

         int[] marks = {90,70,89,79,89};
         change2(marks);
         System.out.println("the value of x after running change is:" + marks[0]);
    }
}