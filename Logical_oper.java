class Logical_oper {
    public static void main(String[] args) {

        //AND = if both true than true otherwise False
        boolean a = true;
        boolean b =false;
        boolean c = false;
        if (a && b && c){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        

        //OR = atleast 1 cond is true than true
        boolean a1 = true;
        boolean b2 = false;
        if (a1 || b2){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }


        //Logical not !
         
        //give opposite value of real value

        System.out.println("not(a)is");
        System.out.println(!a);

        System.out.println("not(b)is:");
        System.out.println(!b);
        }
        }
    
