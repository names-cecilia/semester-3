public class CalculatorTest {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        int totalOne = myCalculator.sum(2,3); 
        /*inputing the value*/
        
        System.out.println(totalOne); 
        /*Printing out the result*/
        
        float totalTwo =  myCalculator.sum(15.99F, 12.85F); 
        /*inputing the value*/
        
        System.out.println(totalTwo); 
        /*Printing out the result*/
        float totalThree = myCalculator.sum(2, 12.85F); 
        /*inputing the value*/
        System.out.println(totalThree); 
        /*Printing out the result*/
}
}
