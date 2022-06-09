public class Array {
    public static void main(String[] args) {

        /*classroom of 500 stdudents- you have to store marks of these 500 students you have 2 option
        1.create 500 variables
        2.use arrays(recommended)*/
        
        //THERE ARE 3 MAIN METHOD TO CREATE AN ARRAY
       /* //1.DECLARATION AND MEMORY ALLOCATION 
        int [] marks = new int[5];*/
        
        //2.DECLARATION AND THEN MEMORY ALLOCATION
        int [] marks;
        marks = new int[5];
        
        //initiLIZation
        mark[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;

        //3.Declaration, memmory allocation and initialization together
        int [] marks = {99,89,90,97,95};

        //marks[5] = 96; //it gives error
        System.out.println(marks[4]);
    }
    
}
