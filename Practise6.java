public class Practise6 {
    public static void main(String[] args) {
        
      
// QUE1:  CREATE AN ARRAY OF 5 FLOATS AND CALCULATE THEIR SUM

       /*float[] value = {90.0f, 80.3f, 40.3f,50.3f,60.2f};
       float sum =0; //create vriable for sum

       for(float element:value){
           sum = sum + element;
       }
       System.out.println(sum);*/

       //===========================================================================================
//QUE2: WRITE A PROGRAM WHETHER A GIVEN INTEGER IS PRESENT IN AN ARRAY OR NOT

       /*int [] prize = {20,90,89,69,98};
       int num = 99;

       if(num == 90){
           System.out.println("yes it is present");

       }
       else
       {
           System.out.println("not present");
       }*/

       //-----------------------------------------
       /*int [] marks = {90,80,80,79,76};
       int num =90;
       boolean isInArray = false; // 90 is not in an array
       for(int element:marks)
       {
            if(num==element)
            {
                isInArray = true;
                break;
            }
       }
       if(isInArray)
       {
            System.out.println("value is present");
       }
       else{
           System.out.println("value is not present");
       }*/

       //=================================================================================

//QUE 3: calculate the average marks from an array containing marks of all students in physics using for each loop
   
       /*int [] marks = {90,50,80,77,98};
       int sum = 0;
       for(int element:marks)  //contain all value of marks
       {
           sum = sum + element;

       }
       System.out.println(sum/marks.length);  //sum/5*

       //================================================================================

//QUE4: CREATE A JAVA PROGRAM TO ADD TWO MATRICES OF SIX 2x3  [2 row, 3column]

       /*int [][] mat1 = { {1,2,3},
                         {4,5,6} };
        int [][] mat2 = { {11,12,13},
                         {14,15,16} };
        int [][] result = { {0,0,0},
                          {0,0,0} };

            for(int i=0; i<mat1.length; i++) //row num of timme
            {
                for(int j=0; j<mat1[i].length; j++) //column num of time
                {
                    System.out.format("setting value for i=%d and j=%d\n",i,j);
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
            
            for(int i=0; i<mat1.length; i++) //row num of timme
            {
                for(int j=0; j<mat1[i].length; j++) //column num of time
                {
                    System.out.print(result[i][j] + " ");
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
                System.out.println(" ");
            }*/

//===================================================================================

//QUE5: WRITE A JAVA PROGRAM TO REVERSE AN ARRAY

int[] reverse = {9,5,4,7,2};
int l = reverse.length;
int n = Math.floorDiv(1, 2);
int temp;

for(int i = 0; i<n; i++)
{
    temp = reverse[i];
    reverse[i] = reverse[l-i-1];
    reverse[l-i-1]=temp;
}
for (int element: reverse)
{
    System.out.println(element + " ");
}
    
//==============================================================================================
//QUE6: WRITE JAVA PROGRAM TO FIND  THE MAXIMUM ELEMENT IN AN ARRAY
int[] arr = {90,80,88,97,96};
int max = Integer.MIN_VALUE;
for(int e: arr)
{

    if(e>max){
        max = e;
    }
}
System.out.println("the value of the maximum element "+ max);
   
   System.out.println(Integer.MIN_VALUE);

   //============================================================================
//QUE7: WRITE JAVA PROGRAM TO FIND THE MAXIMUM ELEMENT IN A JAVA ARRAY.
System.out.println(Integer.MAX_VALUE);

    //====================================================================
//QUE8: 
    boolean isSorted = true;
    int[] arr = {9,60,4,21,1,3};
    for(int i=0; i,arr.length-1; i++){
        if(arr[i] > arr[i=1]){
            isSorted = false;
            break;
        }
    }
    if(isSorted){
        System.out.println("the array is sorted");
    }
    else{
        System.out.println("not sorted");
    }
        }
    }
   
 