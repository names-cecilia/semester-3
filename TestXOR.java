public class TestXOR {
    public static void main(String[] args) {
        boolean val1 = true;
        boolean val2 = true;
        System.out.println(val1 ^ val2);
        /*XOR value of 2 true(s) is false*/
        
        val1 = false;
        val2 = true;
        System.out.println(val1 ^ val2);
        /*XOR value of a false and a true is true*/
        
        val1 = false;
        val2 = false;
        System.out.println(val1 ^ val2);
        /*XOR value of 2 false(s) is false*/
        
        val1 = true;
        val2 = false;
        System.out.println(val1 ^ val2);
        /*XOR value of a true and a false is true*/
    }
}
