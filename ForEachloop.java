public class ForEachloop {
    public static void main(String[] args) {
        //int [] marks ={90,80,79,89,99};
        //float [] marks = {90.0f,70.3f,80.2f,60.4f,80.5f};
        //System.out.println( marks.length);    //show index no.
        //System.out.println(marks[2]); //print index1 value    //show value of given inedx no.
    
        String [] students = {"arya","ditya","rivaan"};
        System.out.println(students.length);

        //DiSPLAYING ARRAY
       /* System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);*/

        //DiSPLAYING ARRAY [FOR LOOP]
       /* System.out.println();
        for(int i=0; i<=marks.length; i++)
        {
            System.out.println(marks[i]);
        }*/

        //DISPLAYING THE ARRAY IN REVERSE ORDER
       /* System.out.println("printing using for loop in reverse order");
        for(int i=students.length -1;i>=0; i--)
        {
            System.out.println(students[i]);
        }*/

        //PRINTIN USING FOR-EACH LOOP    (USE IT IF WE WANT ELEMENT NOT INDEX)
            System.out.println("printing using for-each loop");
            for(String element: students)
            {
                System.out.println(element);
            }
    }    
    
}
