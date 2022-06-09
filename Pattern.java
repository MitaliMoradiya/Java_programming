public class Pattern {
    public static void main(String[] args) {      

        //PRINT SQUARE
        /*int n =4;
        for(int i=1; i<=n; i++)          //Outer loop determines the row
        {
            for (int j=1; j<=n; j++){       // inner loop determines the column
                System.out.print("* ");
            }
            System.out.println();*/

        //INCRESING TRIANGLE PATTERN
            /*int n = 5;
            for(int i=1; i<=5; i++){
                for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            

        }*/


        //DECRESING TRIANGLE PATTERN
           /* int n =5;
            for(int i=1; i<=n; i++){
                for(int j=i; j<=n; j++){
                    System.out.print("*");
                }
                System.out.println();
            }*/

        
        //RIGHT SIDED TRIANGLE
            /*int n = 5;
            for(int i=1; i<=n; i++){
                for(int j=i; j<=n; j++){
                System.out.print(" ");
            }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
            System.out.println();
                }*/

                //CHARACTER PATTERN PROGRAM
                int n=5;
                for(int i=1, p='A'; i<=n; i++,p++){
                    for(int j=1; j<=i; j++){

                        System.out.print((char)p);
                    }
                    System.out.println();
                }
            }
        }

    
