public class Methods{

    static int logic(int x, int y)//create logic method so that it use after without doing same process
    // static methods use for only call staic method. not non S. methods 
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args)
    
    {
        int a = 5;
        int b = 7;
        int c;

        //METHOD INVOCATION USING OBJECT CREATION
        //Methods obj = new Methods();
        //c = obj.logic(a,b);
        c = logic(a,b); //using this method we use only static method
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    } 
}