import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//importing all necessary packages that will be used in this class

public class GetInputFromKeyboard {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        //used to read inputed data
        
        String name = "";
        System.out.println("Please enter your name : ");
        
        try {
            name = dataIn.readLine(); //reading input
        } catch (IOException e) {
            System.out.println("Error!");
        }
        
        System.out.println("Hello " + name + "!");
        //Printing out name and inputed data
    }
}
