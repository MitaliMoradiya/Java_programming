import java.util.Scanner;
public class Sstringmethod {

    public static void main(String[] args)
     {
       String name = "Mitali";
        int value = name.length(); //show length of string
        System.out.println(value);

        String lstring = name.toLowerCase(); //convert to lowercase letter 
        System.out.println(lstring);

        String ustring = name.toUpperCase(); //convert to capital letter
        System.out.println(ustring);
      
        String nonTrimmedString = "      Mitali     "; //print with as it is with space
        System.out.println(nonTrimmedString);

        String TrimmedString;               // remove space than print
        System.out.println(nonTrimmedString.trim()); 

        System.out.println(name.substring(2)); //start with 2nd letter ( begin index start from 0)
        System.out.println(name.substring(2, 4)); //print 2 to 4 index letters(end index start  with 1)

        System.out.println(name.replace('i', 'a')); //i replace to a
        System.out.println(name.replace("Mit","ali")); //Mit replace to ali

        System.out.println(name.startsWith("ali")); // check is it start with "ali"? give Boolean value
        System.out.println(name.startsWith("Mit"));

        System.out.println(name.endsWith("ali")); //check is it end with ali or not.
        System.out.println(name.endsWith("i"));

        System.out.println(name.charAt(2)); //print 2nd char (index start with 0)

        System.out.println(name.indexOf("l")); // print index of the char
        System.out.println(name.indexOf("ali"));

        System.out.println(name.indexOf("i",3)); //find i from index no.3

        System.out.println(name.lastIndexOf("i")); //it print last index of i
        System.out.println(name.lastIndexOf("i", 3)); //count from last char(0,1,2..) (only searc from Mit)

        System.out.println(name.equals("Mitali")); //string is equal or not 
        System.out.println(name.equalsIgnoreCase("miTaLi")); //ignore case (upper & lower both allowed)
       
       System.out.println(name.charAt(2)); //print 2nd index character

       System.out.println("i am escape sequence \" double quote");  //(escape sequence \ )(\"= is add " in line)
                                                                                        
    }
    
}
