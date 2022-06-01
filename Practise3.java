public class Practise3
 {
    public static void main(String[] args) {
        
        /*----------------------Que1--------------------
          convert string to lowercase*/

          String str = "Hello Java";
          System.out.println(str.toLowerCase());

        /*------------------Que2----------------------
          replace space with underscore*/
          System.out.println(str.replace( " ", "_"));

        /*----------------Que3------------------------
            replace name with any name
    */
         String letter = "Dear name, Thanks a lot!";
         System.out.println(letter.replace("name", "Java"));


    /*---------------------Que4-----------------
       Find Double and triple space*/

       String space = "this string contain double  and triple   space" ;
       System.out.println(space.indexOf("  "));
       System.out.println(space.indexOf("   "));


    /*----------------------Que5---------------
       format the following letter using escape character*/

       String mystring = "Dear James goslin \n This java course is nice \n Thanks!!";
       System.out.println(mystring);
    }
 }
