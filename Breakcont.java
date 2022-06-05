public class Breakcont {
    public static void main(String[] args) {
        
      // break and cont using loop
     /* for (int  i=0; i<5; i++){
          System.out.println(i);
          System.out.println("java is great");
          if(i==2){
              System.out.println("ending the loop");
              break; //stop the whole loop
              //continue; //continue the loop
          }
      }*/

      int i =0;
      while(i<5)
      {
          System.out.println("i");
          System.out.println("java is great");
          if(i==2)
          {
              System.out.println("ending the loop");
              break;
              i++
          }
          
      }
    }
}
