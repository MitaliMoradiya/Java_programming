public class Multidimensional {
    public static void main(String[] args) {
        int [] marks; // one dimensional array
        int [][] flats; //two dimensional aaray
        flats = new int [2][3];
        flats[0][0] = 101;  //[0][0]= grnd flours 1st flat & flat no. is 101    
        flats[0][1] = 102;   //[0][1]= grnd flours 2nd flat & flat no. is 102
        flats[0][2] = 103;
        flats[1][0] = 201;  //[1][0] = 1st flours 1st flat
        flats[1][1] = 202;  //[1][1]= 1st flours 2nd flat
        flats[1][2] = 203;
        
       // System.out.println(flats[1][0]);

        for(int i=0; i<flats.length; i++)
        {
            for(int j=0; j<flats[i].length; j++)
            {
            System.out.print(flats[i][j]);
             System.out.print(" ");
            }
             System.out.println("");
           }
        
    }
    
}
