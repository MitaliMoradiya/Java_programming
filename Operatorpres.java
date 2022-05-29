// Precedence of operators / Associativity
/*Precedence means Bigger than other 
    *,/ precedence are same (Higher)
    -,+ precedence are same (lower than *,/)   
    
    Associativity tells direction of the execution of operators left to right*/



public class Operatorpres
{
    public static void main(String[] args)
    {
        int a = 6*5-34/2;
        /* 
        Precedence
            30-34/2
            30 -17
            =13*/

        /*int b = 6/5-34*2;
                12 - 34*2
                12-68
                -56*/

                int x = 2;
                int y = 4;
                int z = 6;
                //int k = x*x - 4*z*y/2*z;
                int k = x*x -(4*z*y)/(2*z); // Parantheses needed for easy calculation
                 System.out.println(k);
        
    }

    
}
