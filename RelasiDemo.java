public class RelasiDemo {
    public static void main(String[] args) {
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println("Nilai variabel..."); /*Printing out each variables' value*/
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
       
        /*Checking out one by one the relation of each variables*/
        System.out.println("Lebih besar dari..."); /*the bigger relation*/
        System.out.println("i > j = " + (i>j)); /*false*/
        System.out.println("j > i = " + (j>i)); /*true*/
        System.out.println("k > j = " + (k>j)); /*false*/
        
        System.out.println("Lebih besar dari atau sama dengan...");
        System.out.println("i > j = " + (i>=j)); /*false*/
        System.out.println("j > i = " + (j>=i)); /*true*/
        System.out.println("k > j = " + (k>=j)); /*true*/
        
        System.out.println("Lebih kecil dari...");
        System.out.println("i > j = " + (i<j)); /*true*/
        System.out.println("j > i = " + (j<i)); /*false*/
        System.out.println("k > j = " + (k<j)); /*false*/
        
        System.out.println("Lebih kecil dari atau sama dengan...");
        System.out.println("i > j = " + (i<=j)); /*true*/
        System.out.println("j > i = " + (j<=i)); /*false*/
        System.out.println("k > j = " + (k<=j)); /*true*/
        
        System.out.println("Sama dengan...");
        System.out.println("i == j = " + (i==j)); /*false*/
        System.out.println("k == j = " + (k==j)); /*true*/
        
        System.out.println("Tidak sama dengan...");
        System.out.println("i != j = " + (i!=j)); /*true*/
        System.out.println("k != j = " + (k!=j)); /*false*/
    }
}
