import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane; //to appear pop-up dialogue window

public class GetInputFromKeyboard2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String name = "", hobby = "";
        
        /*calling pop-up dialogue window to input data*/
        name = JOptionPane.showInputDialog("Nama Anda : ");
        hobby = JOptionPane.showInputDialog("Hobi Anda : ");
        
        /*printing out the messege through pop-up dialogue window*/
        String msg = "Jadi hobi anda adalah " + hobby + ". Hobi yang bagus saudara/i " + name;
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Jadi hobi anda adalah " + hobby + ". Hobi yang bagus saudara/i " + name);
    }
}
