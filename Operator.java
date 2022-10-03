public class Operator {
    //declaring all variables and datatypes
    public int a, b;
    boolean c, d, e;
    double f, g;
    
    public void testOperator(){
        //declaring all variables value
        a= 19;
        b= 2;
        c= true;
        d= false;
        e= !c;
        g= 0.2;
        
        //first operation
        /*IF a is and odd then, add a+1 to */
        if (a%2==1)
            b=a++;
        else
            b=++a;
        
        
        //second operation
        /*if c and notd or e true then, compute a/g*/
        f = (c && !d || e)? a/g : a/(g+1);
        
        //Printing out all variables
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("e : " + e);
        System.out.println("f : " + f);
    }
    
    public static void main(String[] args) {
        Operator oper = new Operator();
        oper.testOperator();
    }
    
    public int checkMonth (int month, int year) {
        int day = 0;
        if (month<8) {
            if(month%2==1)
                day = 31;
            else if (month==2)
                day = (year%4==0)? 29:28;
            else
                day = 30;
        } else {
            if (month%2==1)
                day = 30;
            else
                day = 31;
        }
        return day;
        
    }
}
