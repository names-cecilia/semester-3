public class TestAND {
    public static void main(String[] args) {
        //declaring all variables used
        int i = 0; 
        int j = 10;
        boolean test = false; /*test variable 
        defined as boolean type and the value is false*/
        
        test = (i > 10) && (j++ > 9); 
        /*first statement is false, the second one is true.
        So, the boolean value of this operation should be 'false'*/
        
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        /*printing out the value of the operation and the boolean of it
        (that two statements)*/
        
        
        test = (i > 10) & (j++ > 9);
        /*first statement is false, the second one is true.
        So, the boolean value of this operation should be 'false'*/
        
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        /*printing out the value of the operation and the boolean of it
        (that two statements)*/
    }
}
